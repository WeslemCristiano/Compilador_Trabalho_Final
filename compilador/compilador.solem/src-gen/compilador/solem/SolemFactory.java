/**
 * generated by Xtext 2.34.0
 */
package compilador.solem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see compilador.solem.SolemPackage
 * @generated
 */
public interface SolemFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SolemFactory eINSTANCE = compilador.solem.impl.SolemFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Programa</em>'.
   * @generated
   */
  Programa createPrograma();

  /**
   * Returns a new object of class '<em>Declaracao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaracao</em>'.
   * @generated
   */
  Declaracao createDeclaracao();

  /**
   * Returns a new object of class '<em>Expressao Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao Aritmetica</em>'.
   * @generated
   */
  ExpressaoAritmetica createExpressaoAritmetica();

  /**
   * Returns a new object of class '<em>Outro Termo Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outro Termo Aritmetico</em>'.
   * @generated
   */
  OutroTermoAritmetico createOutroTermoAritmetico();

  /**
   * Returns a new object of class '<em>Termo Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Termo Aritmetico</em>'.
   * @generated
   */
  TermoAritmetico createTermoAritmetico();

  /**
   * Returns a new object of class '<em>Outro Fator Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outro Fator Aritmetico</em>'.
   * @generated
   */
  OutroFatorAritmetico createOutroFatorAritmetico();

  /**
   * Returns a new object of class '<em>Fator Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fator Aritmetico</em>'.
   * @generated
   */
  FatorAritmetico createFatorAritmetico();

  /**
   * Returns a new object of class '<em>Fator Numero</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fator Numero</em>'.
   * @generated
   */
  FatorNumero createFatorNumero();

  /**
   * Returns a new object of class '<em>Fator Variavel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fator Variavel</em>'.
   * @generated
   */
  FatorVariavel createFatorVariavel();

  /**
   * Returns a new object of class '<em>Fator Sub Expressao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fator Sub Expressao</em>'.
   * @generated
   */
  FatorSubExpressao createFatorSubExpressao();

  /**
   * Returns a new object of class '<em>Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao Relacional</em>'.
   * @generated
   */
  ExpressaoRelacional createExpressaoRelacional();

  /**
   * Returns a new object of class '<em>Outro Termo Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Outro Termo Relacional</em>'.
   * @generated
   */
  OutroTermoRelacional createOutroTermoRelacional();

  /**
   * Returns a new object of class '<em>Termo Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Termo Relacional</em>'.
   * @generated
   */
  TermoRelacional createTermoRelacional();

  /**
   * Returns a new object of class '<em>Termo Comparacao Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Termo Comparacao Relacional</em>'.
   * @generated
   */
  TermoComparacaoRelacional createTermoComparacaoRelacional();

  /**
   * Returns a new object of class '<em>Termo Sub Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Termo Sub Expressao Relacional</em>'.
   * @generated
   */
  TermoSubExpressaoRelacional createTermoSubExpressaoRelacional();

  /**
   * Returns a new object of class '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando</em>'.
   * @generated
   */
  Comando createComando();

  /**
   * Returns a new object of class '<em>Comando Atribuicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando Atribuicao</em>'.
   * @generated
   */
  ComandoAtribuicao createComandoAtribuicao();

  /**
   * Returns a new object of class '<em>Comando Entrada</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando Entrada</em>'.
   * @generated
   */
  ComandoEntrada createComandoEntrada();

  /**
   * Returns a new object of class '<em>Comando Saida</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando Saida</em>'.
   * @generated
   */
  ComandoSaida createComandoSaida();

  /**
   * Returns a new object of class '<em>Comando Condicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando Condicao</em>'.
   * @generated
   */
  ComandoCondicao createComandoCondicao();

  /**
   * Returns a new object of class '<em>Comando Repeticao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando Repeticao</em>'.
   * @generated
   */
  ComandoRepeticao createComandoRepeticao();

  /**
   * Returns a new object of class '<em>Sub Algoritmo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Algoritmo</em>'.
   * @generated
   */
  SubAlgoritmo createSubAlgoritmo();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SolemPackage getSolemPackage();

} //SolemFactory
