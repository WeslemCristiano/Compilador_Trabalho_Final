/**
 * generated by Xtext 2.34.0
 */
package compilador.solem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outro Termo Aritmetico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.OutroTermoAritmetico#getOperador <em>Operador</em>}</li>
 *   <li>{@link compilador.solem.OutroTermoAritmetico#getTermo <em>Termo</em>}</li>
 * </ul>
 *
 * @see compilador.solem.SolemPackage#getOutroTermoAritmetico()
 * @model
 * @generated
 */
public interface OutroTermoAritmetico extends EObject
{
  /**
   * Returns the value of the '<em><b>Operador</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operador</em>' attribute.
   * @see #setOperador(String)
   * @see compilador.solem.SolemPackage#getOutroTermoAritmetico_Operador()
   * @model
   * @generated
   */
  String getOperador();

  /**
   * Sets the value of the '{@link compilador.solem.OutroTermoAritmetico#getOperador <em>Operador</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operador</em>' attribute.
   * @see #getOperador()
   * @generated
   */
  void setOperador(String value);

  /**
   * Returns the value of the '<em><b>Termo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Termo</em>' containment reference.
   * @see #setTermo(TermoAritmetico)
   * @see compilador.solem.SolemPackage#getOutroTermoAritmetico_Termo()
   * @model containment="true"
   * @generated
   */
  TermoAritmetico getTermo();

  /**
   * Sets the value of the '{@link compilador.solem.OutroTermoAritmetico#getTermo <em>Termo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Termo</em>' containment reference.
   * @see #getTermo()
   * @generated
   */
  void setTermo(TermoAritmetico value);

} // OutroTermoAritmetico
