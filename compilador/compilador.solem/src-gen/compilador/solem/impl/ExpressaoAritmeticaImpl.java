/**
 * generated by Xtext 2.34.0
 */
package compilador.solem.impl;

import compilador.solem.ExpressaoAritmetica;
import compilador.solem.OutroTermoAritmetico;
import compilador.solem.SolemPackage;
import compilador.solem.TermoAritmetico;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressao Aritmetica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilador.solem.impl.ExpressaoAritmeticaImpl#getTermo1 <em>Termo1</em>}</li>
 *   <li>{@link compilador.solem.impl.ExpressaoAritmeticaImpl#getOutrosTermos <em>Outros Termos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressaoAritmeticaImpl extends MinimalEObjectImpl.Container implements ExpressaoAritmetica
{
  /**
   * The cached value of the '{@link #getTermo1() <em>Termo1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermo1()
   * @generated
   * @ordered
   */
  protected TermoAritmetico termo1;

  /**
   * The cached value of the '{@link #getOutrosTermos() <em>Outros Termos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutrosTermos()
   * @generated
   * @ordered
   */
  protected EList<OutroTermoAritmetico> outrosTermos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressaoAritmeticaImpl()
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
    return SolemPackage.Literals.EXPRESSAO_ARITMETICA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TermoAritmetico getTermo1()
  {
    return termo1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermo1(TermoAritmetico newTermo1, NotificationChain msgs)
  {
    TermoAritmetico oldTermo1 = termo1;
    termo1 = newTermo1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolemPackage.EXPRESSAO_ARITMETICA__TERMO1, oldTermo1, newTermo1);
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
  public void setTermo1(TermoAritmetico newTermo1)
  {
    if (newTermo1 != termo1)
    {
      NotificationChain msgs = null;
      if (termo1 != null)
        msgs = ((InternalEObject)termo1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolemPackage.EXPRESSAO_ARITMETICA__TERMO1, null, msgs);
      if (newTermo1 != null)
        msgs = ((InternalEObject)newTermo1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolemPackage.EXPRESSAO_ARITMETICA__TERMO1, null, msgs);
      msgs = basicSetTermo1(newTermo1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolemPackage.EXPRESSAO_ARITMETICA__TERMO1, newTermo1, newTermo1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OutroTermoAritmetico> getOutrosTermos()
  {
    if (outrosTermos == null)
    {
      outrosTermos = new EObjectContainmentEList<OutroTermoAritmetico>(OutroTermoAritmetico.class, this, SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS);
    }
    return outrosTermos;
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
      case SolemPackage.EXPRESSAO_ARITMETICA__TERMO1:
        return basicSetTermo1(null, msgs);
      case SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS:
        return ((InternalEList<?>)getOutrosTermos()).basicRemove(otherEnd, msgs);
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
      case SolemPackage.EXPRESSAO_ARITMETICA__TERMO1:
        return getTermo1();
      case SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS:
        return getOutrosTermos();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SolemPackage.EXPRESSAO_ARITMETICA__TERMO1:
        setTermo1((TermoAritmetico)newValue);
        return;
      case SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS:
        getOutrosTermos().clear();
        getOutrosTermos().addAll((Collection<? extends OutroTermoAritmetico>)newValue);
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
      case SolemPackage.EXPRESSAO_ARITMETICA__TERMO1:
        setTermo1((TermoAritmetico)null);
        return;
      case SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS:
        getOutrosTermos().clear();
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
      case SolemPackage.EXPRESSAO_ARITMETICA__TERMO1:
        return termo1 != null;
      case SolemPackage.EXPRESSAO_ARITMETICA__OUTROS_TERMOS:
        return outrosTermos != null && !outrosTermos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressaoAritmeticaImpl
