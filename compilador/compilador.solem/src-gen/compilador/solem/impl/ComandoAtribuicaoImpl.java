/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.impl;

import compilador.solem.ComandoAtribuicao;
import compilador.solem.Declaracao;
import compilador.solem.ExpressaoAritmetica;
import compilador.solem.SolemPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Atribuicao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.impl.ComandoAtribuicaoImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link compilador.solem.impl.ComandoAtribuicaoImpl#getVariavel <em>Variavel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoAtribuicaoImpl extends ComandoImpl implements ComandoAtribuicao
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected ExpressaoAritmetica exp;

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
  protected ComandoAtribuicaoImpl()
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
    return SolemPackage.Literals.COMANDO_ATRIBUICAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressaoAritmetica getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(ExpressaoAritmetica newExp, NotificationChain msgs)
  {
    ExpressaoAritmetica oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolemPackage.COMANDO_ATRIBUICAO__EXP, oldExp, newExp);
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
  public void setExp(ExpressaoAritmetica newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolemPackage.COMANDO_ATRIBUICAO__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolemPackage.COMANDO_ATRIBUICAO__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.COMANDO_ATRIBUICAO__EXP, newExp, newExp));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL, oldVariavel, variavel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL, oldVariavel, variavel));
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
      case SolemPackage.COMANDO_ATRIBUICAO__EXP:
        return basicSetExp(null, msgs);
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
      case SolemPackage.COMANDO_ATRIBUICAO__EXP:
        return getExp();
      case SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL:
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
      case SolemPackage.COMANDO_ATRIBUICAO__EXP:
        setExp((ExpressaoAritmetica)newValue);
        return;
      case SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL:
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
      case SolemPackage.COMANDO_ATRIBUICAO__EXP:
        setExp((ExpressaoAritmetica)null);
        return;
      case SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL:
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
      case SolemPackage.COMANDO_ATRIBUICAO__EXP:
        return exp != null;
      case SolemPackage.COMANDO_ATRIBUICAO__VARIAVEL:
        return variavel != null;
    }
    return super.eIsSet(featureID);
  }

} //ComandoAtribuicaoImpl
