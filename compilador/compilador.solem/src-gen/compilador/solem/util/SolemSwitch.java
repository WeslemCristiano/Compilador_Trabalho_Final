/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.util;

import compilador.solem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see compilador.solem.SolemPackage
 * @generated
 */
public class SolemSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SolemPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolemSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SolemPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SolemPackage.PROGRAMA:
      {
        Programa programa = (Programa)theEObject;
        T result = casePrograma(programa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.DECLARACAO:
      {
        Declaracao declaracao = (Declaracao)theEObject;
        T result = caseDeclaracao(declaracao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.EXPRESSAO_ARITMETICA:
      {
        ExpressaoAritmetica expressaoAritmetica = (ExpressaoAritmetica)theEObject;
        T result = caseExpressaoAritmetica(expressaoAritmetica);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.OUTRO_TERMO_ARITMETICO:
      {
        OutroTermoAritmetico outroTermoAritmetico = (OutroTermoAritmetico)theEObject;
        T result = caseOutroTermoAritmetico(outroTermoAritmetico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.TERMO_ARITMETICO:
      {
        TermoAritmetico termoAritmetico = (TermoAritmetico)theEObject;
        T result = caseTermoAritmetico(termoAritmetico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.OUTRO_FATOR_ARITMETICO:
      {
        OutroFatorAritmetico outroFatorAritmetico = (OutroFatorAritmetico)theEObject;
        T result = caseOutroFatorAritmetico(outroFatorAritmetico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.FATOR_ARITMETICO:
      {
        FatorAritmetico fatorAritmetico = (FatorAritmetico)theEObject;
        T result = caseFatorAritmetico(fatorAritmetico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.FATOR_NUMERO:
      {
        FatorNumero fatorNumero = (FatorNumero)theEObject;
        T result = caseFatorNumero(fatorNumero);
        if (result == null) result = caseFatorAritmetico(fatorNumero);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.FATOR_VARIAVEL:
      {
        FatorVariavel fatorVariavel = (FatorVariavel)theEObject;
        T result = caseFatorVariavel(fatorVariavel);
        if (result == null) result = caseFatorAritmetico(fatorVariavel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.FATOR_SUB_EXPRESSAO:
      {
        FatorSubExpressao fatorSubExpressao = (FatorSubExpressao)theEObject;
        T result = caseFatorSubExpressao(fatorSubExpressao);
        if (result == null) result = caseFatorAritmetico(fatorSubExpressao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.EXPRESSAO_RELACIONAL:
      {
        ExpressaoRelacional expressaoRelacional = (ExpressaoRelacional)theEObject;
        T result = caseExpressaoRelacional(expressaoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.OUTRO_TERMO_RELACIONAL:
      {
        OutroTermoRelacional outroTermoRelacional = (OutroTermoRelacional)theEObject;
        T result = caseOutroTermoRelacional(outroTermoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.TERMO_RELACIONAL:
      {
        TermoRelacional termoRelacional = (TermoRelacional)theEObject;
        T result = caseTermoRelacional(termoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL:
      {
        TermoComparacaoRelacional termoComparacaoRelacional = (TermoComparacaoRelacional)theEObject;
        T result = caseTermoComparacaoRelacional(termoComparacaoRelacional);
        if (result == null) result = caseTermoRelacional(termoComparacaoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL:
      {
        TermoSubExpressaoRelacional termoSubExpressaoRelacional = (TermoSubExpressaoRelacional)theEObject;
        T result = caseTermoSubExpressaoRelacional(termoSubExpressaoRelacional);
        if (result == null) result = caseTermoRelacional(termoSubExpressaoRelacional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO:
      {
        Comando comando = (Comando)theEObject;
        T result = caseComando(comando);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO_ATRIBUICAO:
      {
        ComandoAtribuicao comandoAtribuicao = (ComandoAtribuicao)theEObject;
        T result = caseComandoAtribuicao(comandoAtribuicao);
        if (result == null) result = caseComando(comandoAtribuicao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO_ENTRADA:
      {
        ComandoEntrada comandoEntrada = (ComandoEntrada)theEObject;
        T result = caseComandoEntrada(comandoEntrada);
        if (result == null) result = caseComando(comandoEntrada);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO_SAIDA:
      {
        ComandoSaida comandoSaida = (ComandoSaida)theEObject;
        T result = caseComandoSaida(comandoSaida);
        if (result == null) result = caseComando(comandoSaida);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO_CONDICAO:
      {
        ComandoCondicao comandoCondicao = (ComandoCondicao)theEObject;
        T result = caseComandoCondicao(comandoCondicao);
        if (result == null) result = caseComando(comandoCondicao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.COMANDO_REPETICAO:
      {
        ComandoRepeticao comandoRepeticao = (ComandoRepeticao)theEObject;
        T result = caseComandoRepeticao(comandoRepeticao);
        if (result == null) result = caseComando(comandoRepeticao);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SolemPackage.SUB_ALGORITMO:
      {
        SubAlgoritmo subAlgoritmo = (SubAlgoritmo)theEObject;
        T result = caseSubAlgoritmo(subAlgoritmo);
        if (result == null) result = caseComando(subAlgoritmo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrograma(Programa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaracao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaracao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaracao(Declaracao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressao Aritmetica</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressao Aritmetica</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressaoAritmetica(ExpressaoAritmetica object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outro Termo Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outro Termo Aritmetico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutroTermoAritmetico(OutroTermoAritmetico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Termo Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Termo Aritmetico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermoAritmetico(TermoAritmetico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outro Fator Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outro Fator Aritmetico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutroFatorAritmetico(OutroFatorAritmetico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fator Aritmetico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fator Aritmetico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFatorAritmetico(FatorAritmetico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fator Numero</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fator Numero</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFatorNumero(FatorNumero object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fator Variavel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fator Variavel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFatorVariavel(FatorVariavel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fator Sub Expressao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fator Sub Expressao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFatorSubExpressao(FatorSubExpressao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressao Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressaoRelacional(ExpressaoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Outro Termo Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Outro Termo Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutroTermoRelacional(OutroTermoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Termo Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Termo Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermoRelacional(TermoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Termo Comparacao Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Termo Comparacao Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermoComparacaoRelacional(TermoComparacaoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Termo Sub Expressao Relacional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Termo Sub Expressao Relacional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermoSubExpressaoRelacional(TermoSubExpressaoRelacional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComando(Comando object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando Atribuicao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando Atribuicao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandoAtribuicao(ComandoAtribuicao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando Entrada</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando Entrada</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandoEntrada(ComandoEntrada object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando Saida</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando Saida</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandoSaida(ComandoSaida object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando Condicao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando Condicao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandoCondicao(ComandoCondicao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comando Repeticao</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comando Repeticao</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComandoRepeticao(ComandoRepeticao object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Algoritmo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Algoritmo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubAlgoritmo(SubAlgoritmo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SolemSwitch
