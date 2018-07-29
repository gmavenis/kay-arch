package kay.arch.errorhandler.resolver

import java.lang.ref.WeakReference

/**
 * Created by Kay Tran on 2/2/18.
 * Profile: https://github.com/khatv911
 * Email: khatv911@gmail.com
 */
abstract class AbsUiResolver constructor(protected val fragmentRef: WeakReference<androidx.fragment.app.Fragment>) : UiResolver {

    constructor(fragment: androidx.fragment.app.Fragment) : this(WeakReference(fragment))

//    override fun resolveErrorMessage(message: String, retryOption: Pair<Boolean, Int?>) {}
//
//    override fun resolveErrorMessage(resource: Int, retryOption: Pair<Boolean, Int?>) {}
//
//    //NO-OP
//    override fun showConnectivity(available: Boolean) {}
//
//    // NO-OP
//    override fun resolveNotFound(retryOption: Pair<Boolean, Int?>) {}
//
//    override fun resolveUnAuthorized() {}
//
//    //NO-OP
//    override fun resolveForbidden() {}
//
//    override fun showSuccess(message: String?) {}
}