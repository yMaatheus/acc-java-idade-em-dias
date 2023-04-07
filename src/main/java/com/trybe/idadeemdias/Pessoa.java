package com.trybe.idadeemdias;

/**
 * Class Pessoa.
 */
public class Pessoa {

  /**
   * Method show age to days.
   */
  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    int anosEmDias = anos * 365;
    int mesesEmDias = meses * 30;

    return anosEmDias + mesesEmDias + dias;
  }
}
