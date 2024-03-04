/**
 * generated by Xtext 2.34.0
 */
package compilador.solem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.Programa#getDeclaracoes <em>Declaracoes</em>}</li>
 *   <li>{@link compilador.solem.Programa#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @see compilador.solem.SolemPackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaracoes</b></em>' containment reference list.
   * The list contents are of type {@link compilador.solem.Declaracao}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracoes</em>' containment reference list.
   * @see compilador.solem.SolemPackage#getPrograma_Declaracoes()
   * @model containment="true"
   * @generated
   */
  EList<Declaracao> getDeclaracoes();

  /**
   * Returns the value of the '<em><b>Comandos</b></em>' containment reference list.
   * The list contents are of type {@link compilador.solem.Comando}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comandos</em>' containment reference list.
   * @see compilador.solem.SolemPackage#getPrograma_Comandos()
   * @model containment="true"
   * @generated
   */
  EList<Comando> getComandos();

} // Programa
