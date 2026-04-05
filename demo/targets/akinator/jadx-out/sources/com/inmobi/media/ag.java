package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final int f32659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32662d;

    public ag(int i10, int i11, int i12, int i13) {
        this.f32659a = i10;
        this.f32660b = i11;
        this.f32661c = i12;
        this.f32662d = i13;
    }

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.LEFT, D2.a(this.f32659a));
            jSONObject.put("top", D2.a(this.f32660b));
            jSONObject.put(TtmlNode.RIGHT, D2.a(this.f32661c));
            jSONObject.put("bottom", D2.a(this.f32662d));
            return jSONObject;
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return this.f32659a == agVar.f32659a && this.f32660b == agVar.f32660b && this.f32661c == agVar.f32661c && this.f32662d == agVar.f32662d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32662d) + e3.g.d(this.f32661c, e3.g.d(this.f32660b, Integer.hashCode(this.f32659a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f32659a);
        sb2.append(", top=");
        sb2.append(this.f32660b);
        sb2.append(", right=");
        sb2.append(this.f32661c);
        sb2.append(", bottom=");
        return e3.g.m(sb2, this.f32662d, ')');
    }
}
