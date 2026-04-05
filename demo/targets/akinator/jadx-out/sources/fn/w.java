package fn;

import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f55778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f55779c;

    public w(y yVar, List list) {
        this.f55779c = yVar;
        this.f55778b = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            for (ym.d dVar : this.f55778b) {
                if (dVar != null) {
                    for (ym.v vVar : dVar.getVerificationTagList()) {
                        ym.l javaScriptResourceTag = vVar.getJavaScriptResourceTag();
                        String text = javaScriptResourceTag != null ? javaScriptResourceTag.getText() : null;
                        String vendor = vVar.getVendor();
                        String verificationParameters = vVar.getVerificationParameters();
                        if (!TextUtils.isEmpty(text)) {
                            this.f55779c.addVerificationScriptResource(text, vendor, verificationParameters);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
