/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#getnullMedications() <em>Getnull Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionHasMedicationOrSupplyActivity() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionHasMedicationOrSupplyActivityTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionHasMedicationOrSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionHasMedicationOrSupplyActivity(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionHasMedicationOrSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionEntriesOptionalCode(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionTitle() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionTitleTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionTitle(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionText() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionTextTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionText(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionMedication() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionMedicationTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionMedication(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetnullMedications() {

		MedicationsSection target = objectFactory.create();
		target.getnullMedications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<MedicationsSection> validateMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<MedicationsSection>(
			"validateMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateMedicationsSectionEntriesOptionalTemplateId(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<MedicationsSection> {

		public MedicationsSection create() {
			return ConsolFactory.eINSTANCE.createMedicationsSection();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends MedicationsSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // MedicationsSectionOperations