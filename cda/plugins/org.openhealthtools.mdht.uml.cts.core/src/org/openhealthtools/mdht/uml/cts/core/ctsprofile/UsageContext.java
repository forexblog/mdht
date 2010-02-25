/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cts.core.ctsprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage#getUsageContext()
 * @model
 * @generated
 */
public interface UsageContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage#getUsageContext_Identifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind
	 * @see #setStatus(StatusKind)
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage#getUsageContext_Status()
	 * @model ordered="false"
	 * @generated
	 */
	StatusKind getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusKind value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(String)
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage#getUsageContext_StatusDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getStatusDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage#getUsageContext_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // UsageContext