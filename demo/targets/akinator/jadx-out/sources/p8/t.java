package p8;

import android.util.Log;
import com.bumptech.glide.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f80883a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80884b;

    /* renamed from: c, reason: collision with root package name */
    public final c9.e f80885c;

    /* renamed from: d, reason: collision with root package name */
    public final w3.f f80886d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80887e;

    public t(Class<Object> cls, Class<Object> cls2, Class<Object> cls3, List<? extends n8.x> list, c9.e eVar, w3.f fVar) {
        this.f80883a = cls;
        this.f80884b = list;
        this.f80885c = eVar;
        this.f80886d = fVar;
        this.f80887e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final v0 a(com.bumptech.glide.load.data.g gVar, int i10, int i11, n8.v vVar, List list) throws q0 {
        List list2 = this.f80884b;
        int size = list2.size();
        v0 v0VarDecode = null;
        for (int i12 = 0; i12 < size; i12++) {
            n8.x xVar = (n8.x) list2.get(i12);
            try {
                if (xVar.handles(gVar.rewindAndGet(), vVar)) {
                    v0VarDecode = xVar.decode(gVar.rewindAndGet(), i10, i11, vVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + xVar, e10);
                }
                list.add(e10);
            }
            if (v0VarDecode != null) {
                break;
            }
        }
        if (v0VarDecode != null) {
            return v0VarDecode;
        }
        throw new q0(this.f80887e, new ArrayList(list));
    }

    public v0 decode(com.bumptech.glide.load.data.g gVar, int i10, int i11, n8.v vVar, s sVar) throws q0, m.d {
        w3.f fVar = this.f80886d;
        List list = (List) j9.q.checkNotNull(fVar.acquire());
        try {
            v0 v0VarA = a(gVar, i10, i11, vVar, list);
            fVar.release(list);
            return this.f80885c.transcode(((n) sVar).onResourceDecoded(v0VarA), vVar);
        } catch (Throwable th2) {
            fVar.release(list);
            throw th2;
        }
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f80883a + ", decoders=" + this.f80884b + ", transcoder=" + this.f80885c + AbstractJsonLexerKt.END_OBJ;
    }
}
