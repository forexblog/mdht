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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimen;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureSpecimenOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Specimen</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimen#validateProcedureSpecimenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimen Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureSpecimenTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimenTemplateId() {
		OperationsTestCase<ProcedureSpecimen> validateProcedureSpecimenTemplateIdTestCase = new OperationsTestCase<ProcedureSpecimen>(
			"validateProcedureSpecimenTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimen target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimen target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimenOperations.validateProcedureSpecimenTemplateId(
					(ProcedureSpecimen) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimenTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureSpecimenOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureSpecimen> {
		public ProcedureSpecimen create() {
			return ConsolFactory.eINSTANCE.createProcedureSpecimen();
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
	private static class ConstructorTestClass extends ProcedureSpecimenOperations {
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

} // ProcedureSpecimenOperations
