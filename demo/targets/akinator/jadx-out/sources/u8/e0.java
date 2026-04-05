package u8;

import android.text.TextUtils;
import j1.o2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f88072b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f88073c;

    public e0(Map map) {
        this.f88072b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f88072b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strBuildHeader = ((d0) ((b0) list.get(i10))).buildHeader();
                if (!TextUtils.isEmpty(strBuildHeader)) {
                    sb2.append(strBuildHeader);
                    if (i10 != list.size() - 1) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f88072b.equals(((e0) obj).f88072b);
        }
        return false;
    }

    @Override // u8.a0
    public Map<String, String> getHeaders() {
        if (this.f88073c == null) {
            synchronized (this) {
                try {
                    if (this.f88073c == null) {
                        this.f88073c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f88073c;
    }

    public int hashCode() {
        return this.f88072b.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("LazyHeaders{headers="), this.f88072b, AbstractJsonLexerKt.END_OBJ);
    }
}
