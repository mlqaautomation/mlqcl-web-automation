package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class RenewTestScript extends BaseTest {

    @Test(priority = 1, groups = "HappyPath")
    public void toValidateRenewTransaction() throws Exception {
        RenewTestSteps.toValidateRenewTransaction();

    }

    @Test(priority = 2, groups = "HappyPath")
    public void validateRenewOrReceipt() throws Exception {
        RenewTestSteps.validateRenewOrReceipt();

    }

    @Test(priority = 3, groups = "HappyPath")
    public void validateRenewReceipt() throws Exception {
        RenewTestSteps.validateRenewReceipt();

    }
//
    @Test(priority = 4, groups = "HappyPath")
    public void validatePaymentMethod() throws Exception {
        RenewTestSteps.validatePaymentMethod();

    }

    @Test(priority = 5, groups = "HappyPath")
    public void validateItemsDataGrid() throws Exception {
        RenewTestSteps.validateItemsDataGrid();

    }

    @Test(priority = 6, groups = "HappyPath")
    public void validateIfTenderInputFieldIsEnable() throws Exception {
        RenewTestSteps.validateIfTenderInputFieldIsEnable();

    }

    @Test(priority = 7, groups = "HappyPath")
    public void validateInvalidTenderAmount() throws Exception {
        RenewTestSteps.validateInvalidTenderAmount();

    }

    @Test(priority = 8, groups = "HappyPath")
    public void validateNewRenewalTransaction() throws Exception {
        RenewTestSteps.validateNewRenewalTransaction();

    }

    @Test(priority = 9, groups = "HappyPath")
    public void validateSaveButtonIsDisable() throws Exception {
        RenewTestSteps.validateSaveButtonIsDisable();

    }


}
