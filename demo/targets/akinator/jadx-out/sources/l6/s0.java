package l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends d {
    @Override // l6.j
    public boolean isSupportedByWebView() {
        if (super.isSupportedByWebView() && k6.w.isFeatureSupported("MULTI_PROCESS")) {
            return k6.v.isMultiProcessEnabled();
        }
        return false;
    }
}
