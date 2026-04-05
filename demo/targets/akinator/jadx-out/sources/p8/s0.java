package p8;

import com.bumptech.glide.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f80879a;

    /* renamed from: b, reason: collision with root package name */
    public final w3.f f80880b;

    /* renamed from: c, reason: collision with root package name */
    public final List f80881c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80882d;

    public s0(Class<Object> cls, Class<Object> cls2, Class<Object> cls3, List<t> list, w3.f fVar) {
        this.f80879a = cls;
        this.f80880b = fVar;
        this.f80881c = (List) j9.q.checkNotEmpty(list);
        this.f80882d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Class<Object> getDataClass() {
        return this.f80879a;
    }

    public v0 load(com.bumptech.glide.load.data.g gVar, n8.v vVar, int i10, int i11, s sVar) throws q0, m.d {
        w3.f fVar = this.f80880b;
        List list = (List) j9.q.checkNotNull(fVar.acquire());
        try {
            List list2 = this.f80881c;
            int size = list2.size();
            v0 v0VarDecode = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    v0VarDecode = ((t) list2.get(i12)).decode(gVar, i10, i11, vVar, sVar);
                } catch (q0 e10) {
                    list.add(e10);
                }
                if (v0VarDecode != null) {
                    break;
                }
            }
            if (v0VarDecode != null) {
                return v0VarDecode;
            }
            throw new q0(this.f80882d, new ArrayList(list));
        } finally {
            fVar.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f80881c.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
