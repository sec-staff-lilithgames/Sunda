package om;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h extends up.b {
    public h(Ad ad2) {
        super(ad2);
        getData().put("creativeId", ad2.getId());
    }

    @Override // up.b
    public boolean isValid() {
        Object obj = getData().get("creativeAdm");
        return (obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj);
    }
}
