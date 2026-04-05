package u8;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f88060d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f88061a = true;

    /* renamed from: b, reason: collision with root package name */
    public Map f88062b = f88060d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88063c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            property = sb2.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new d0(property)));
        }
        f88060d = Collections.unmodifiableMap(map);
    }

    public final void a() {
        if (this.f88061a) {
            this.f88061a = false;
            HashMap map = new HashMap(this.f88062b.size());
            for (Map.Entry entry : this.f88062b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f88062b = map;
        }
    }

    public c0 addHeader(String str, String str2) {
        return addHeader(str, new d0(str2));
    }

    public e0 build() {
        this.f88061a = true;
        return new e0(this.f88062b);
    }

    public c0 setHeader(String str, String str2) {
        return setHeader(str, str2 == null ? null : new d0(str2));
    }

    public c0 addHeader(String str, b0 b0Var) {
        if (this.f88063c && Command.HTTP_HEADER_USER_AGENT.equalsIgnoreCase(str)) {
            return setHeader(str, b0Var);
        }
        a();
        List arrayList = (List) this.f88062b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f88062b.put(str, arrayList);
        }
        arrayList.add(b0Var);
        return this;
    }

    public c0 setHeader(String str, b0 b0Var) {
        a();
        if (b0Var == null) {
            this.f88062b.remove(str);
        } else {
            List arrayList = (List) this.f88062b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f88062b.put(str, arrayList);
            }
            arrayList.clear();
            arrayList.add(b0Var);
        }
        if (this.f88063c && Command.HTTP_HEADER_USER_AGENT.equalsIgnoreCase(str)) {
            this.f88063c = false;
        }
        return this;
    }
}
