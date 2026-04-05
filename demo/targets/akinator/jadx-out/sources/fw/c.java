package fw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f56122c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f56123e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f56124f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f56125g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f56126h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f56127i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f56128j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c[] f56129k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ cv.a f56130l;

    /* renamed from: b, reason: collision with root package name */
    public final int f56131b;

    static {
        c cVar = new c("NO_ERROR", 0, 0);
        f56123e = cVar;
        c cVar2 = new c("PROTOCOL_ERROR", 1, 1);
        f56124f = cVar2;
        c cVar3 = new c("INTERNAL_ERROR", 2, 2);
        f56125g = cVar3;
        c cVar4 = new c("FLOW_CONTROL_ERROR", 3, 3);
        f56126h = cVar4;
        c cVar5 = new c("SETTINGS_TIMEOUT", 4, 4);
        c cVar6 = new c("STREAM_CLOSED", 5, 5);
        c cVar7 = new c("FRAME_SIZE_ERROR", 6, 6);
        c cVar8 = new c("REFUSED_STREAM", 7, 7);
        f56127i = cVar8;
        c cVar9 = new c("CANCEL", 8, 8);
        f56128j = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, new c("COMPRESSION_ERROR", 9, 9), new c("CONNECT_ERROR", 10, 10), new c("ENHANCE_YOUR_CALM", 11, 11), new c("INADEQUATE_SECURITY", 12, 12), new c("HTTP_1_1_REQUIRED", 13, 13)};
        f56129k = cVarArr;
        f56130l = cv.b.enumEntries(cVarArr);
        f56122c = new b(null);
    }

    public c(String str, int i10, int i11) {
        this.f56131b = i11;
    }

    public static cv.a getEntries() {
        return f56130l;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f56129k.clone();
    }

    public final int getHttpCode() {
        return this.f56131b;
    }
}
