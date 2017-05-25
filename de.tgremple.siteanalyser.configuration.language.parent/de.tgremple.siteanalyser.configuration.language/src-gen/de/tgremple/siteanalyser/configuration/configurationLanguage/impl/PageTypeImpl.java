/**
 * generated by Xtext 2.12.0
 */
package de.tgremple.siteanalyser.configuration.configurationLanguage.impl;

import de.tgremple.siteanalyser.configuration.configurationLanguage.ConfigurationLanguagePackage;
import de.tgremple.siteanalyser.configuration.configurationLanguage.PageSelector;
import de.tgremple.siteanalyser.configuration.configurationLanguage.PageType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tgremple.siteanalyser.configuration.configurationLanguage.impl.PageTypeImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageTypeImpl extends TypeImpl implements PageType
{
  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected PageSelector selector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageTypeImpl()
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
    return ConfigurationLanguagePackage.Literals.PAGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageSelector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(PageSelector newSelector, NotificationChain msgs)
  {
    PageSelector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(PageSelector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR, newSelector, newSelector));
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
      case ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR:
        return basicSetSelector(null, msgs);
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
      case ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR:
        return getSelector();
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
      case ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR:
        setSelector((PageSelector)newValue);
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
      case ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR:
        setSelector((PageSelector)null);
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
      case ConfigurationLanguagePackage.PAGE_TYPE__SELECTOR:
        return selector != null;
    }
    return super.eIsSet(featureID);
  }

} //PageTypeImpl