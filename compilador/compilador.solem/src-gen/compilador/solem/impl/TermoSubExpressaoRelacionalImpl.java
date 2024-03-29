/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.impl;

import compilador.solem.ExpressaoRelacional;
import compilador.solem.SolemPackage;
import compilador.solem.TermoSubExpressaoRelacional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termo Sub Expressao Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.impl.TermoSubExpressaoRelacionalImpl#getExpRel <em>Exp Rel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermoSubExpressaoRelacionalImpl extends TermoRelacionalImpl implements TermoSubExpressaoRelacional
{
  /**
   * The cached value of the '{@link #getExpRel() <em>Exp Rel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpRel()
   * @generated
   * @ordered
   */
  protected ExpressaoRelacional expRel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermoSubExpressaoRelacionalImpl()
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
    return SolemPackage.Literals.TERMO_SUB_EXPRESSAO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoRelacional getExpRel()
  {
    return expRel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpRel(ExpressaoRelacional newExpRel, NotificationChain msgs)
  {
    ExpressaoRelacional oldExpRel = expRel;
    expRel = newExpRel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL, oldExpRel, newExpRel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpRel(ExpressaoRelacional newExpRel)
  {
    if (newExpRel != expRel)
    {
      NotificationChain msgs = null;
      if (expRel != null)
        msgs = ((InternalEObject)expRel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL, null, msgs);
      if (newExpRel != null)
        msgs = ((InternalEObject)newExpRel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL, null, msgs);
      msgs = basicSetExpRel(newExpRel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL, newExpRel, newExpRel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL:
        return basicSetExpRel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL:
        return getExpRel();
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
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL:
        setExpRel((ExpressaoRelacional)newValue);
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
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL:
        setExpRel((ExpressaoRelacional)null);
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
      case SolemPackage.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL:
        return expRel != null;
    }
    return super.eIsSet(featureID);
  }

} //TermoSubExpressaoRelacionalImpl
