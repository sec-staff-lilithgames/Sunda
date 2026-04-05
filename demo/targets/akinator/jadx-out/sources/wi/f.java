package wi;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ui.h;
import ui.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements ui.g, i {

    /* renamed from: a, reason: collision with root package name */
    public f f90639a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f90640b = true;

    /* renamed from: c, reason: collision with root package name */
    public final JsonWriter f90641c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f90642d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f90643e;

    /* renamed from: f, reason: collision with root package name */
    public final ui.f f90644f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f90645g;

    public f(Writer writer, HashMap map, HashMap map2, ui.f fVar, boolean z10) {
        this.f90641c = new JsonWriter(writer);
        this.f90642d = map;
        this.f90643e = map2;
        this.f90644f = fVar;
        this.f90645g = z10;
    }

    public final f a(Object obj, boolean z10) throws IOException {
        if (z10 && (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number))) {
            throw new ui.c((obj == null ? null : obj.getClass()) + " cannot be encoded inline");
        }
        JsonWriter jsonWriter = this.f90641c;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    jsonWriter.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    add(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    a(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    a(obj2, false);
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                a(it.next(), false);
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new ui.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        ui.f fVar = (ui.f) this.f90642d.get(obj.getClass());
        if (fVar != null) {
            if (!z10) {
                jsonWriter.beginObject();
            }
            fVar.encode(obj, this);
            if (!z10) {
                jsonWriter.endObject();
                return this;
            }
        } else {
            h hVar = (h) this.f90643e.get(obj.getClass());
            if (hVar != null) {
                hVar.encode(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                if (obj instanceof g) {
                    add(((g) obj).getNumber());
                    return this;
                }
                add(((Enum) obj).name());
                return this;
            }
            if (!z10) {
                jsonWriter.beginObject();
            }
            this.f90644f.encode(obj, this);
            if (!z10) {
                jsonWriter.endObject();
            }
        }
        return this;
    }

    public final void b() throws IOException {
        if (!this.f90640b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        f fVar = this.f90639a;
        if (fVar != null) {
            fVar.b();
            this.f90639a.f90640b = false;
            this.f90639a = null;
            this.f90641c.endObject();
        }
    }

    @Override // ui.g
    public ui.g inline(Object obj) throws IOException {
        return a(obj, true);
    }

    @Override // ui.g
    public ui.g nested(String str) throws IOException {
        b();
        this.f90639a = new f(this);
        JsonWriter jsonWriter = this.f90641c;
        jsonWriter.name(str);
        jsonWriter.beginObject();
        return this.f90639a;
    }

    @Override // ui.g
    public ui.g nested(ui.e eVar) throws IOException {
        return nested(eVar.getName());
    }

    public f(f fVar) {
        this.f90641c = fVar.f90641c;
        this.f90642d = fVar.f90642d;
        this.f90643e = fVar.f90643e;
        this.f90644f = fVar.f90644f;
        this.f90645g = fVar.f90645g;
    }

    @Override // ui.g
    public f add(String str, Object obj) throws IOException {
        boolean z10 = this.f90645g;
        JsonWriter jsonWriter = this.f90641c;
        if (z10) {
            if (obj == null) {
                return this;
            }
            b();
            jsonWriter.name(str);
            return a(obj, false);
        }
        b();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return a(obj, false);
    }

    @Override // ui.g
    public f add(String str, double d10) throws IOException {
        b();
        this.f90641c.name(str);
        return add(d10);
    }

    @Override // ui.g
    public f add(String str, int i10) throws IOException {
        b();
        this.f90641c.name(str);
        return add(i10);
    }

    @Override // ui.g
    public f add(String str, long j10) throws IOException {
        b();
        this.f90641c.name(str);
        return add(j10);
    }

    @Override // ui.g
    public f add(String str, boolean z10) throws IOException {
        b();
        this.f90641c.name(str);
        return add(z10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, Object obj) throws IOException {
        return add(eVar.getName(), obj);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, float f10) throws IOException {
        return add(eVar.getName(), f10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, double d10) throws IOException {
        return add(eVar.getName(), d10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, int i10) throws IOException {
        return add(eVar.getName(), i10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, long j10) throws IOException {
        return add(eVar.getName(), j10);
    }

    @Override // ui.g
    public ui.g add(ui.e eVar, boolean z10) throws IOException {
        return add(eVar.getName(), z10);
    }

    @Override // ui.i
    public f add(String str) throws IOException {
        b();
        this.f90641c.value(str);
        return this;
    }

    @Override // ui.i
    public f add(float f10) throws IOException {
        b();
        this.f90641c.value(f10);
        return this;
    }

    @Override // ui.i
    public f add(double d10) throws IOException {
        b();
        this.f90641c.value(d10);
        return this;
    }

    @Override // ui.i
    public f add(int i10) throws IOException {
        b();
        this.f90641c.value(i10);
        return this;
    }

    @Override // ui.i
    public f add(long j10) throws IOException {
        b();
        this.f90641c.value(j10);
        return this;
    }

    @Override // ui.i
    public f add(boolean z10) throws IOException {
        b();
        this.f90641c.value(z10);
        return this;
    }

    @Override // ui.i
    public f add(byte[] bArr) throws IOException {
        b();
        JsonWriter jsonWriter = this.f90641c;
        if (bArr == null) {
            jsonWriter.nullValue();
            return this;
        }
        jsonWriter.value(Base64.encodeToString(bArr, 2));
        return this;
    }
}
