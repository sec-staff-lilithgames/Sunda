package f1;

import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import tu.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f55283a = p1.hashMapOf(e0.to(j.f55294b, "emailAddress"), e0.to(j.f55295c, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER), e0.to(j.f55296e, "password"), e0.to(j.f55297f, "newUsername"), e0.to(j.f55298g, "newPassword"), e0.to(j.f55299h, "postalAddress"), e0.to(j.f55300i, "postalCode"), e0.to(j.f55301j, "creditCardNumber"), e0.to(j.f55302k, "creditCardSecurityCode"), e0.to(j.f55303l, "creditCardExpirationDate"), e0.to(j.f55304m, "creditCardExpirationMonth"), e0.to(j.f55305n, "creditCardExpirationYear"), e0.to(j.f55306o, "creditCardExpirationDay"), e0.to(j.f55307p, "addressCountry"), e0.to(j.f55308q, "addressRegion"), e0.to(j.f55309r, "addressLocality"), e0.to(j.f55310s, "streetAddress"), e0.to(j.f55311t, "extendedAddress"), e0.to(j.f55312u, "extendedPostalCode"), e0.to(j.f55313v, "personName"), e0.to(j.f55314w, "personGivenName"), e0.to(j.f55315x, "personFamilyName"), e0.to(j.f55316y, "personMiddleName"), e0.to(j.f55317z, "personMiddleInitial"), e0.to(j.A, "personNamePrefix"), e0.to(j.B, "personNameSuffix"), e0.to(j.C, "phoneNumber"), e0.to(j.D, "phoneNumberDevice"), e0.to(j.E, "phoneCountryCode"), e0.to(j.F, "phoneNational"), e0.to(j.G, InneractiveMediationDefs.KEY_GENDER), e0.to(j.H, "birthDateFull"), e0.to(j.I, "birthDateDay"), e0.to(j.J, "birthDateMonth"), e0.to(j.K, "birthDateYear"), e0.to(j.L, "smsOTPCode"));

    public static final String getAndroidType(j jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<this>");
        String str = (String) f55283a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    public static /* synthetic */ void getAndroidType$annotations(j jVar) {
    }
}
