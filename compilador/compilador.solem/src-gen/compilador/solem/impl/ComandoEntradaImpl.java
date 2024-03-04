/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.impl;

import compilador.solem.ComandoEntrada;
import compilador.solem.Declaracao;
import compilador.solem.SolemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Entrada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.impl.ComandoEntradaImpl#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoEntradaImpl extends ComandoImpl implements ComandoEntrada
{
  /**
   * The cached value of the '{@link #getVariavel() <em>Variavel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariavel()
   * @generated
   * @ordered
   */
  protected Declaracao variavel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoEntradaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SolemPackage.Literals.COMANDO_ENTRADA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaracao getVariavel()
  {
    if (variavel != null && variavel.eIsProxy())
    {
      InternalEObject oldVariavel = (InternalEObject)variavel;
      variavel = (Declaracao)eResolveProxy(oldVariavel);
      if (variavel != oldVariavel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolemPackage.COMANDO_ENTRADA__VARIAVEL, oldVariavel, variavel));
      }
    }
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaracao basicGetVariavel()
  {
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariavel(Declaracao newVariavel)
  {
    Declaracao oldVariavel = variavel;
    variavel = newVariavel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.COMANDO_ENTRADA__VARIAVEL, oldVariavel, variavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SolemPackage.COMANDO_ENTRADA__VARIAVEL:
        if (resolve) return getVariavel();
        return basicGetVariavel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SolemPackage.COMANDO_ENTRADA__VARIAVEL:
        setVariavel((Declaracao)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SolemPackage.COMANDO_ENTRADA__VARIAVEL:
        setVariavel((Declaracao)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SolemPackage.COMANDO_ENTRADA__VARIAVEL:
        return variavel != null;
    }
    return super.eIsSet(featureID);
  }

} //ComandoEntradaImpl