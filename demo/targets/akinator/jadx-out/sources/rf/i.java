package rf;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f84342a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f84343b = new ArrayList();

    public static i setContentLength(i iVar, long j10) {
        return iVar.set("exo_len", j10);
    }

    public static i setRedirectedUri(i iVar, Uri uri) {
        return uri == null ? iVar.remove("exo_redir") : iVar.set("exo_redir", uri.toString());
    }

    public final void a(String str, Serializable serializable) {
        this.f84342a.put((String) com.google.android.exoplayer2.util.a.checkNotNull(str), com.google.android.exoplayer2.util.a.checkNotNull(serializable));
        this.f84343b.remove(str);
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.f84342a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.f84343b));
    }

    public i remove(String str) {
        this.f84343b.add(str);
        this.f84342a.remove(str);
        return this;
    }

    public i set(String str, String str2) {
        a(str, str2);
        return this;
    }

    public i set(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
    public i set(String str, byte[] bArr) {
        a(str, Arrays.copyOf(bArr, bArr.length));
        return this;
    }
}
