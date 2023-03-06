package monopoly;


public class ComputerPlayer implements Player {
  private Tile currentTile;
  private String name;
  private int funds;
  private ConsoleUi ui = null;

  

  public ComputerPlayer(Tile startTile, String name, ConsoleUi ui) {
    this.name = name;
    this.ui = ui;
    this.currentTile = startTile;
    currentTile.stoppedOn(this);
    funds = 500;
  }

  @Override
  public int getFunds() {
    return funds;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
  private void move(int steps) {
    currentTile.startOn(this);

    for (int i = 0; i < steps; i++) {
      currentTile.visit(this);
      currentTile = currentTile.getNext();  
    }
    currentTile.stoppedOn(this);
  }

  @Override
  public boolean yourTurn(Dice d1, Dice d2) {
    if (funds <= 300) {
      d1.roll();
      d2.roll();
      final int steps1 = d1.getValue();
      final int steps2 = d2.getValue();
      ui.playerMoves(getName(), steps1, steps2);
      move(steps1 + steps2);
    }
    else if(funds >300) {
      if (currentTile.buy(this)) {
        ui.playerBuysProperty(getName(), currentTile.toString());
      }
      d1.roll();
      d2.roll();
      final int steps1 = d1.getValue();
      final int steps2 = d2.getValue();
      ui.playerMoves(getName(), steps1, steps2);
      move(steps1 + steps2);
    }
    return true;
  }
  
  @Override
  public int payRent(int amount) {
    if (funds < amount) {
      amount = funds;
    }
    funds -= amount;
    ui.playerPaysRentFor(getName(), currentTile.toString(), amount);
    return amount;
  }
  
  @Override
  public boolean deduceFunds(int cost) {
    if (funds > cost) {
      funds -= cost;
      ui.playerFundsDeduced(getName(), cost);

      return true;
    } else {
      ui.playerUnableToPay(getName(), cost);
      return false;
    }
  }
  
  @Override
  public void addFunds(int amount) {
    funds += amount;
    ui.playerReceivedFunds(getName(), amount);
  }
  
}
