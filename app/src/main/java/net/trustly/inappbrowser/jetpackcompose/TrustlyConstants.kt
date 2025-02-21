package net.trustly.inappbrowser.jetpackcompose

object TrustlyConstants {

    const val TRUSTLY_URL = "http://10.0.2.2:3000?integrationContext=InAppBrowser&urlScheme="
    const val OAUTH_LOGIN_PATH = "/oauth/login"
    const val TRUSTLY_PROCEED_TO_CHOOSE_ACCOUNT_SCRIPT = "javascript:if (window.Trustly && window.Trustly.proceedToChooseAccount) window.Trustly.proceedToChooseAccount();"

}