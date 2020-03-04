package materials;

public class Coin {

  private CoinState coinState;

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    int temp = (Math.random() <= 0.5) ? 1 : 2;
    if (temp == 1){
      coinState = coinState.HEADS;
    }else {
      coinState = coinState.TAILS;
    }
  }

  public CoinState getState() {
    return coinState;
  }


}
