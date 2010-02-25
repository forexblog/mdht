/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAFactory;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryKind;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationshipKind;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavorKind;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification;

import org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDAPackageImpl extends EPackageImpl implements CDAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codegenSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullFlavorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdaTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformsToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nullFlavorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDAPackageImpl() {
		super(eNS_URI, CDAFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDAPackage init() {
		if (isInited) return (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Obtain or create and register package
		CDAPackageImpl theCDAPackage = (CDAPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CDAPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CDAPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CTSPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDAPackage.createPackageContents();

		// Initialize created meta-data
		theCDAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDAPackage.freeze();

		return theCDAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidationSupport() {
		return validationSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidationSupport_Severity() {
		return (EAttribute)validationSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidationSupport_Message() {
		return (EAttribute)validationSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationSupport_Base_Association() {
		return (EReference)validationSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationSupport_Base_Class() {
		return (EReference)validationSupportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationSupport_Base_Property() {
		return (EReference)validationSupportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_TypeCode() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationValidation() {
		return associationValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationValidation_Base_Association() {
		return (EReference)associationValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidation_Message() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidation_Severity() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidation_RuleId() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryRelationship() {
		return entryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryRelationship_TypeCode() {
		return (EAttribute)entryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodegenSupport() {
		return codegenSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodegenSupport_BasePackage() {
		return (EAttribute)codegenSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodegenSupport_NsPrefix() {
		return (EAttribute)codegenSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodegenSupport_NsURI() {
		return (EAttribute)codegenSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodegenSupport_PackageName() {
		return (EAttribute)codegenSupportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodegenSupport_Prefix() {
		return (EAttribute)codegenSupportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodegenSupport_Base_Namespace() {
		return (EReference)codegenSupportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValidation() {
		return propertyValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValidation_Base_Property() {
		return (EReference)propertyValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassValidation() {
		return classValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassValidation_Base_Class() {
		return (EReference)classValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabSpecification() {
		return vocabSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabSpecification_Code() {
		return (EAttribute)vocabSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystem() {
		return (EAttribute)vocabSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystemName() {
		return (EAttribute)vocabSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystemVersion() {
		return (EAttribute)vocabSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabSpecification_DisplayName() {
		return (EAttribute)vocabSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullFlavor() {
		return nullFlavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullFlavor_NullFlavor() {
		return (EAttribute)nullFlavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextValue() {
		return textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValue_Value() {
		return (EAttribute)textValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValue_IgnoreCase() {
		return (EAttribute)textValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDATemplate() {
		return cdaTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDATemplate_TemplateId() {
		return (EAttribute)cdaTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDATemplate_AssigningAuthorityName() {
		return (EAttribute)cdaTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDATemplate_ContextDependent() {
		return (EAttribute)cdaTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintValidation() {
		return constraintValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintValidation_Base_Constraint() {
		return (EReference)constraintValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformsTo() {
		return conformsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformsTo_Base_Generalization() {
		return (EReference)conformsToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainConstraint() {
		return conceptDomainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemConstraint() {
		return codeSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverityKind() {
		return severityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntryKind() {
		return entryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntryRelationshipKind() {
		return entryRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNullFlavorKind() {
		return nullFlavorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAFactory getCDAFactory() {
		return (CDAFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validationSupportEClass = createEClass(VALIDATION_SUPPORT);
		createEAttribute(validationSupportEClass, VALIDATION_SUPPORT__SEVERITY);
		createEAttribute(validationSupportEClass, VALIDATION_SUPPORT__MESSAGE);
		createEReference(validationSupportEClass, VALIDATION_SUPPORT__BASE_ASSOCIATION);
		createEReference(validationSupportEClass, VALIDATION_SUPPORT__BASE_CLASS);
		createEReference(validationSupportEClass, VALIDATION_SUPPORT__BASE_PROPERTY);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__TYPE_CODE);

		associationValidationEClass = createEClass(ASSOCIATION_VALIDATION);
		createEReference(associationValidationEClass, ASSOCIATION_VALIDATION__BASE_ASSOCIATION);

		validationEClass = createEClass(VALIDATION);
		createEAttribute(validationEClass, VALIDATION__MESSAGE);
		createEAttribute(validationEClass, VALIDATION__SEVERITY);
		createEAttribute(validationEClass, VALIDATION__RULE_ID);

		entryRelationshipEClass = createEClass(ENTRY_RELATIONSHIP);
		createEAttribute(entryRelationshipEClass, ENTRY_RELATIONSHIP__TYPE_CODE);

		codegenSupportEClass = createEClass(CODEGEN_SUPPORT);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__BASE_PACKAGE);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__NS_PREFIX);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__NS_URI);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__PACKAGE_NAME);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__PREFIX);
		createEReference(codegenSupportEClass, CODEGEN_SUPPORT__BASE_NAMESPACE);

		propertyValidationEClass = createEClass(PROPERTY_VALIDATION);
		createEReference(propertyValidationEClass, PROPERTY_VALIDATION__BASE_PROPERTY);

		classValidationEClass = createEClass(CLASS_VALIDATION);
		createEReference(classValidationEClass, CLASS_VALIDATION__BASE_CLASS);

		vocabSpecificationEClass = createEClass(VOCAB_SPECIFICATION);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM_NAME);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__DISPLAY_NAME);

		nullFlavorEClass = createEClass(NULL_FLAVOR);
		createEAttribute(nullFlavorEClass, NULL_FLAVOR__NULL_FLAVOR);

		textValueEClass = createEClass(TEXT_VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__IGNORE_CASE);

		cdaTemplateEClass = createEClass(CDA_TEMPLATE);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__TEMPLATE_ID);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__CONTEXT_DEPENDENT);

		constraintValidationEClass = createEClass(CONSTRAINT_VALIDATION);
		createEReference(constraintValidationEClass, CONSTRAINT_VALIDATION__BASE_CONSTRAINT);

		conformsToEClass = createEClass(CONFORMS_TO);
		createEReference(conformsToEClass, CONFORMS_TO__BASE_GENERALIZATION);

		conceptDomainConstraintEClass = createEClass(CONCEPT_DOMAIN_CONSTRAINT);

		codeSystemConstraintEClass = createEClass(CODE_SYSTEM_CONSTRAINT);

		valueSetConstraintEClass = createEClass(VALUE_SET_CONSTRAINT);

		// Create enums
		severityKindEEnum = createEEnum(SEVERITY_KIND);
		entryKindEEnum = createEEnum(ENTRY_KIND);
		entryRelationshipKindEEnum = createEEnum(ENTRY_RELATIONSHIP_KIND);
		nullFlavorKindEEnum = createEEnum(NULL_FLAVOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CTSPackage theCTSPackage = (CTSPackage)EPackage.Registry.INSTANCE.getEPackage(CTSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entryEClass.getESuperTypes().add(this.getAssociationValidation());
		associationValidationEClass.getESuperTypes().add(this.getValidation());
		entryRelationshipEClass.getESuperTypes().add(this.getAssociationValidation());
		propertyValidationEClass.getESuperTypes().add(this.getValidation());
		classValidationEClass.getESuperTypes().add(this.getValidation());
		vocabSpecificationEClass.getESuperTypes().add(this.getPropertyValidation());
		nullFlavorEClass.getESuperTypes().add(this.getPropertyValidation());
		textValueEClass.getESuperTypes().add(this.getPropertyValidation());
		cdaTemplateEClass.getESuperTypes().add(this.getClassValidation());
		constraintValidationEClass.getESuperTypes().add(this.getValidation());
		conceptDomainConstraintEClass.getESuperTypes().add(theCTSPackage.getConceptDomainConstraint());
		conceptDomainConstraintEClass.getESuperTypes().add(this.getValidation());
		codeSystemConstraintEClass.getESuperTypes().add(theCTSPackage.getCodeSystemConstraint());
		codeSystemConstraintEClass.getESuperTypes().add(this.getValidation());
		valueSetConstraintEClass.getESuperTypes().add(theCTSPackage.getValueSetConstraint());
		valueSetConstraintEClass.getESuperTypes().add(this.getValidation());

		// Initialize classes and features; add operations and parameters
		initEClass(validationSupportEClass, ValidationSupport.class, "ValidationSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationSupport_Severity(), this.getSeverityKind(), "severity", null, 0, 1, ValidationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValidationSupport_Message(), ecorePackage.getEString(), "message", null, 0, 1, ValidationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValidationSupport_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, ValidationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValidationSupport_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, ValidationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValidationSupport_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ValidationSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_TypeCode(), this.getEntryKind(), "typeCode", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(associationValidationEClass, AssociationValidation.class, "AssociationValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationValidation_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, AssociationValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(validationEClass, Validation.class, "Validation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidation_Message(), ecorePackage.getEString(), "message", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValidation_Severity(), this.getSeverityKind(), "severity", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValidation_RuleId(), ecorePackage.getEString(), "ruleId", null, 0, -1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entryRelationshipEClass, EntryRelationship.class, "EntryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryRelationship_TypeCode(), this.getEntryRelationshipKind(), "typeCode", null, 0, 1, EntryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codegenSupportEClass, CodegenSupport.class, "CodegenSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodegenSupport_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodegenSupport_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodegenSupport_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodegenSupport_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodegenSupport_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodegenSupport_Base_Namespace(), theUMLPackage.getNamespace(), null, "base_Namespace", null, 1, 1, CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyValidationEClass, PropertyValidation.class, "PropertyValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyValidation_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, PropertyValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classValidationEClass, ClassValidation.class, "ClassValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassValidation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, ClassValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocabSpecificationEClass, VocabSpecification.class, "VocabSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVocabSpecification_Code(), ecorePackage.getEString(), "code", null, 0, 1, VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVocabSpecification_CodeSystem(), ecorePackage.getEString(), "codeSystem", null, 0, 1, VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVocabSpecification_CodeSystemName(), ecorePackage.getEString(), "codeSystemName", null, 0, 1, VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVocabSpecification_CodeSystemVersion(), ecorePackage.getEString(), "codeSystemVersion", null, 0, 1, VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVocabSpecification_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nullFlavorEClass, NullFlavor.class, "NullFlavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullFlavor_NullFlavor(), this.getNullFlavorKind(), "nullFlavor", null, 0, 1, NullFlavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextValue_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", "false", 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cdaTemplateEClass, CDATemplate.class, "CDATemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDATemplate_TemplateId(), ecorePackage.getEString(), "templateId", null, 0, 1, CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCDATemplate_AssigningAuthorityName(), ecorePackage.getEString(), "assigningAuthorityName", null, 0, 1, CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCDATemplate_ContextDependent(), ecorePackage.getEBoolean(), "contextDependent", "false", 0, 1, CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintValidationEClass, ConstraintValidation.class, "ConstraintValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintValidation_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conformsToEClass, ConformsTo.class, "ConformsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformsTo_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 1, 1, ConformsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptDomainConstraintEClass, ConceptDomainConstraint.class, "ConceptDomainConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSystemConstraintEClass, CodeSystemConstraint.class, "CodeSystemConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSetConstraintEClass, ValueSetConstraint.class, "ValueSetConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(severityKindEEnum, SeverityKind.class, "SeverityKind");
		addEEnumLiteral(severityKindEEnum, SeverityKind.ERROR);
		addEEnumLiteral(severityKindEEnum, SeverityKind.WARNING);
		addEEnumLiteral(severityKindEEnum, SeverityKind.INFO);

		initEEnum(entryKindEEnum, EntryKind.class, "EntryKind");
		addEEnumLiteral(entryKindEEnum, EntryKind.COMP);
		addEEnumLiteral(entryKindEEnum, EntryKind.DRIV);

		initEEnum(entryRelationshipKindEEnum, EntryRelationshipKind.class, "EntryRelationshipKind");
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.CAUS);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.COMP);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.GEVL);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.MFST);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.REFR);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.RSON);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SAS);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SPRT);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SUBJ);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.XCRPT);

		initEEnum(nullFlavorKindEEnum, NullFlavorKind.class, "NullFlavorKind");
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.ASKU);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.MSK);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NA);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NASK);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NAV);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NI);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NINF);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.OTH);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.PINF);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.QS);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.TRC);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.UNC);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.UNK);

		// Create resource
		createResource(eNS_URI);
	}

} //CDAPackageImpl