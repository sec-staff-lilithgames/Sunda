package wm;

import android.os.Bundle;
import android.text.TextUtils;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.w;
import io.bidmachine.iab.vast.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public VastAd f90742b;

    /* renamed from: c, reason: collision with root package name */
    public w f90743c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f90741a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f90744d = true;

    public final void a(ym.a aVar, w wVar) {
        this.f90743c = wVar;
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", wVar.getCode());
        List<String> errorUrlList = aVar.getErrorUrlList();
        if (errorUrlList == null || errorUrlList.isEmpty()) {
            return;
        }
        Iterator<String> it = errorUrlList.iterator();
        while (it.hasNext()) {
            String strProcessUrl = y.processUrl(it.next(), bundle);
            if (!TextUtils.isEmpty(strProcessUrl)) {
                this.f90741a.add(strProcessUrl);
            }
        }
    }

    public VastAd getVastAd() {
        return this.f90742b;
    }

    public w getVastSpecError() {
        return this.f90743c;
    }

    public boolean hasVastAd() {
        return this.f90742b != null;
    }
}
