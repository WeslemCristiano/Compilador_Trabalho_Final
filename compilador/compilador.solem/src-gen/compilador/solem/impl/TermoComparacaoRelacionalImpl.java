/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.impl;

import compilador.solem.ExpressaoAritmetica;
import compilador.solem.SolemPackage;
import compilador.solem.TermoComparacaoRelacional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Termo Comparacao Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.impl.TermoComparacaoRelacionalImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link compilador.solem.impl.TermoComparacaoRelacionalImpl#getOpRel <em>Op Rel</em>}</li>
 *   <li>{@link compilador.solem.impl.TermoComparacaoRelacionalImpl#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermoComparacaoRelacionalImpl extends TermoRelacionalImpl implements TermoComparacaoRelacional
{
  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected ExpressaoAritmetica exp1;

  /**
   * The default value of the '{@link #getOpRel() <em>Op Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpRel()
   * @generated
   * @ordered
   */
  protected static final String OP_REL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpRel() <em>Op Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpRel()
   * @generated
   * @ordered
   */
  protected String opRel = OP_REL_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected ExpressaoAritmetica exp2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermoComparacaoRelacionalImpl()
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
    return SolemPackage.Literals.TERMO_COMPARACAO_RELACIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp1(ExpressaoAritmetica newExp1, NotificationChain msgs)
  {
    ExpressaoAritmetica oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1, oldExp1, newExp1);
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
  public void setExp1(ExpressaoAritmetica newExp1)
  {
    if (newExp1 != exp1)
    {
      NotificationChain msgs = null;
      if (exp1 != null)
        msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1, null, msgs);
      if (newExp1 != null)
        msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1, null, msgs);
      msgs = basicSetExp1(newExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1, newExp1, newExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOpRel()
  {
    return opRel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpRel(String newOpRel)
  {
    String oldOpRel = opRel;
    opRel = newOpRel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_COMPARACAO_RELACIONAL__OP_REL, oldOpRel, opRel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(ExpressaoAritmetica newExp2, NotificationChain msgs)
  {
    ExpressaoAritmetica oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2, oldExp2, newExp2);
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
  public void setExp2(ExpressaoAritmetica newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2, newExp2, newExp2));
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
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1:
        return basicSetExp1(null, msgs);
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2:
        return basicSetExp2(null, msgs);
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
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1:
        return getExp1();
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        return getOpRel();
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2:
        return getExp2();
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
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1:
        setExp1((ExpressaoAritmetica)newValue);
        return;
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        setOpRel((String)newValue);
        return;
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2:
        setExp2((ExpressaoAritmetica)newValue);
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
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1:
        setExp1((ExpressaoAritmetica)null);
        return;
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        setOpRel(OP_REL_EDEFAULT);
        return;
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2:
        setExp2((ExpressaoAritmetica)null);
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
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP1:
        return exp1 != null;
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__OP_REL:
        return OP_REL_EDEFAULT == null ? opRel != null : !OP_REL_EDEFAULT.equals(opRel);
      case SolemPackage.TERMO_COMPARACAO_RELACIONAL__EXP2:
        return exp2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (opRel: ");
    result.append(opRel);
    result.append(')');
    return result.toString();
  }

} //TermoComparacaoRelacionalImpl
