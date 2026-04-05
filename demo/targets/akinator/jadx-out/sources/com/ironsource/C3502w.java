package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3502w implements InterfaceC3256hf<JSONObject>, InterfaceC3220ff<C3468u> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, G0> f39147a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f39148b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.w$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39149a;

        static {
            int[] iArr = new int[EnumC3202ef.values().length];
            try {
                iArr[EnumC3202ef.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3202ef.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3202ef.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3202ef.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3202ef.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39149a = iArr;
        }
    }

    private final void b(C3468u c3468u) {
        int i10;
        int i11 = a.f39149a[c3468u.f().ordinal()];
        if (i11 == 2) {
            this.f39148b++;
        } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (i10 = this.f39148b) > 0) {
            this.f39148b = i10 - 1;
        }
    }

    public final int a() {
        return this.f39148b;
    }

    @Override // com.ironsource.InterfaceC3220ff
    public void a(C3468u record) {
        kotlin.jvm.internal.e0.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, G0> map = this.f39147a;
        G0 g02 = map.get(strC);
        if (g02 == null) {
            g02 = new G0();
            map.put(strC, g02);
        }
        g02.a(record.a(new C3485v()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC3248h7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3238gf mode) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, G0> entry : this.f39147a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f39147a.isEmpty();
    }
}
