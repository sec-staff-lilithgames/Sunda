package androidx.work;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.google.android.gms.ads.RequestConfiguration;
import f.j0;
import j1.o2;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kv.l;
import n6.c0;
import n6.j;
import uu.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0007b f7480b = new C0007b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final b f7481c = new a().build();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7482a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f7483a = new LinkedHashMap();

        public final b build() {
            b bVar = new b(this.f7483a);
            b.f7480b.toByteArrayInternalV1(bVar);
            return bVar;
        }

        public final a put(String key, Object obj) {
            e0.checkNotNullParameter(key, "key");
            if (obj == null) {
                obj = null;
            } else {
                KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(obj.getClass());
                if (!e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Boolean.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Byte.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Integer.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Long.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Float.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Double.TYPE)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(String.class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Boolean[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Byte[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Integer[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Long[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Float[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Double[].class)) && !e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(String[].class))) {
                    if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(boolean[].class))) {
                        obj = j.access$convertPrimitiveArray((boolean[]) obj);
                    } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(byte[].class))) {
                        obj = j.access$convertPrimitiveArray((byte[]) obj);
                    } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(int[].class))) {
                        obj = j.access$convertPrimitiveArray((int[]) obj);
                    } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(long[].class))) {
                        obj = j.access$convertPrimitiveArray((long[]) obj);
                    } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(float[].class))) {
                        obj = j.access$convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + orCreateKotlinClass);
                        }
                        obj = j.access$convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            this.f7483a.put(key, obj);
            return this;
        }

        public final a putAll(b data) {
            e0.checkNotNullParameter(data, "data");
            putAll(data.f7482a);
            return this;
        }

        public final a putBoolean(String key, boolean z10) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, Boolean.valueOf(z10));
            return this;
        }

        public final a putBooleanArray(String key, boolean[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putByteArray(String key, byte[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putDouble(String key, double d10) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, Double.valueOf(d10));
            return this;
        }

        public final a putDoubleArray(String key, double[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putFloat(String key, float f10) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, Float.valueOf(f10));
            return this;
        }

        public final a putFloatArray(String key, float[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putInt(String key, int i10) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, Integer.valueOf(i10));
            return this;
        }

        public final a putIntArray(String key, int[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putLong(String key, long j10) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, Long.valueOf(j10));
            return this;
        }

        public final a putLongArray(String key, long[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, j.access$convertPrimitiveArray(value));
            return this;
        }

        public final a putString(String key, String str) {
            e0.checkNotNullParameter(key, "key");
            this.f7483a.put(key, str);
            return this;
        }

        public final a putStringArray(String key, String[] value) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(value, "value");
            this.f7483a.put(key, value);
            return this;
        }

        public final a putAll(Map<String, ? extends Object> values) {
            e0.checkNotNullParameter(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a putByte(String str, byte b10) {
            e0.checkNotNullParameter(str, QFzuMMDfrzagDN.IFPrUyV);
            this.f7483a.put(str, Byte.valueOf(b10));
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static final class C0007b {
        public C0007b(u uVar) {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable a(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                ?? r02 = new Boolean[i11];
                while (i10 < i11) {
                    r02[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return r02;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                ?? r03 = new Byte[i12];
                while (i10 < i12) {
                    r03[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return r03;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                ?? r04 = new Integer[i13];
                while (i10 < i13) {
                    r04[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return r04;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                ?? r05 = new Long[i14];
                while (i10 < i14) {
                    r05[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return r05;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                ?? r06 = new Float[i15];
                while (i10 < i15) {
                    r06[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return r06;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                ?? r07 = new Double[i16];
                while (i10 < i16) {
                    r07[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return r07;
            }
            if (b10 != 14) {
                throw new IllegalStateException(a.b.e(b10, "Unsupported type "));
            }
            int i17 = dataInputStream.readInt();
            ?? r12 = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (e0.areEqual(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r12[i10] = utf;
                i10++;
            }
            return r12;
        }

        public static final void b(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i10;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + c1.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
                }
                Object[] objArr = (Object[]) obj;
                KClass orCreateKotlinClass = c1.getOrCreateKotlinClass(objArr.getClass());
                if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Boolean[].class))) {
                    i10 = 8;
                } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Byte[].class))) {
                    i10 = 9;
                } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Integer[].class))) {
                    i10 = 10;
                } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Long[].class))) {
                    i10 = 11;
                } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Float[].class))) {
                    i10 = 12;
                } else if (e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(Double[].class))) {
                    i10 = 13;
                } else {
                    if (!e0.areEqual(orCreateKotlinClass, c1.getOrCreateKotlinClass(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + c1.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                    }
                    i10 = 14;
                }
                dataOutputStream.writeByte(i10);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i10 == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i10 == 9) {
                        Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                    } else if (i10 == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i10 == 11) {
                        Long l9 = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l9 != null ? l9.longValue() : 0L);
                    } else if (i10 == 12) {
                        Float f10 = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                    } else if (i10 == 13) {
                        Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                    } else if (i10 == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.work.b fromByteArray(byte[] r8) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.C0007b.fromByteArray(byte[]):androidx.work.b");
        }

        @tu.f
        public final byte[] toByteArrayInternalV0(b data) {
            e0.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.f7482a.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str);
                            objectOutputStream.writeObject(value);
                        }
                        gv.d.closeFinally(objectOutputStream, null);
                        gv.d.closeFinally(byteArrayOutputStream, null);
                        if (byteArrayOutputStream.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        e0.checkNotNull(byteArray);
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e10) {
                c0.get().error(j.f75747a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        public final byte[] toByteArrayInternalV1(b data) {
            e0.checkNotNullParameter(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(data.size());
                    for (Map.Entry entry : data.f7482a.entrySet()) {
                        b(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gv.d.closeFinally(dataOutputStream, null);
                    e0.checkNotNull(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                c0.get().error(j.f75747a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7484b;

        public c(Object obj) {
            this.f7484b = obj;
        }

        public final Boolean invoke(int i10) {
            Object obj = ((Object[]) this.f7484b)[i10];
            if (obj != null) {
                return (Boolean) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7485b;

        public d(Object obj) {
            this.f7485b = obj;
        }

        public final Byte invoke(int i10) {
            Object obj = ((Object[]) this.f7485b)[i10];
            if (obj != null) {
                return (Byte) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7486b;

        public e(Object obj) {
            this.f7486b = obj;
        }

        public final Double invoke(int i10) {
            Object obj = ((Object[]) this.f7486b)[i10];
            if (obj != null) {
                return (Double) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7487b;

        public f(Object obj) {
            this.f7487b = obj;
        }

        public final Float invoke(int i10) {
            Object obj = ((Object[]) this.f7487b)[i10];
            if (obj != null) {
                return (Float) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7488b;

        public g(Object obj) {
            this.f7488b = obj;
        }

        public final Integer invoke(int i10) {
            Object obj = ((Object[]) this.f7488b)[i10];
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7489b;

        public h(Object obj) {
            this.f7489b = obj;
        }

        public final Long invoke(int i10) {
            Object obj = ((Object[]) this.f7489b)[i10];
            if (obj != null) {
                return (Long) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7490b;

        public i(Object obj) {
            this.f7490b = obj;
        }

        public final String invoke(int i10) {
            Object obj = ((Object[]) this.f7490b)[i10];
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public b(b other) {
        e0.checkNotNullParameter(other, "other");
        this.f7482a = new HashMap(other.f7482a);
    }

    public static final b fromByteArray(byte[] bArr) {
        return f7480b.fromByteArray(bArr);
    }

    @tu.f
    public static final byte[] toByteArrayInternalV0(b bVar) {
        return f7480b.toByteArrayInternalV0(bVar);
    }

    public static final byte[] toByteArrayInternalV1(b bVar) {
        return f7480b.toByteArrayInternalV1(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L66
        L5:
            r1 = 0
            if (r9 == 0) goto L67
            java.lang.Class<androidx.work.b> r2 = androidx.work.b.class
            java.lang.Class r3 = r9.getClass()
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            androidx.work.b r9 = (androidx.work.b) r9
            java.util.HashMap r9 = r9.f7482a
            java.util.HashMap r2 = r8.f7482a
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.e0.areEqual(r3, r4)
            if (r4 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5e
            if (r4 != 0) goto L47
            goto L5e
        L47:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L59
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = uu.w.contentDeepEquals(r6, r4)
            goto L63
        L59:
            boolean r4 = kotlin.jvm.internal.e0.areEqual(r5, r4)
            goto L63
        L5e:
            if (r5 != r4) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r1
        L63:
            if (r4 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.equals(java.lang.Object):boolean");
    }

    public final boolean getBoolean(String key, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Boolean.valueOf(z10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean[] getBooleanArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        c cVar = new c(obj);
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) cVar.invoke(Integer.valueOf(i10))).booleanValue();
        }
        return zArr;
    }

    public final byte getByte(String key, byte b10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Byte.valueOf(b10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Byte) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    public final byte[] getByteArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        d dVar = new d(obj);
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) dVar.invoke(Integer.valueOf(i10))).byteValue();
        }
        return bArr;
    }

    public final double getDouble(String key, double d10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Double.valueOf(d10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    public final double[] getDoubleArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        e eVar = new e(obj);
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) eVar.invoke(Integer.valueOf(i10))).doubleValue();
        }
        return dArr;
    }

    public final float getFloat(String key, float f10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Float.valueOf(f10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    public final float[] getFloatArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        f fVar = new f(obj);
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) fVar.invoke(Integer.valueOf(i10))).floatValue();
        }
        return fArr;
    }

    public final int getInt(String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Integer.valueOf(i10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final int[] getIntArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        g gVar = new g(obj);
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) gVar.invoke(Integer.valueOf(i10))).intValue();
        }
        return iArr;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f7482a);
        e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final long getLong(String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        Object objValueOf = Long.valueOf(j10);
        Object obj = this.f7482a.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final long[] getLongArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        h hVar = new h(obj);
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) hVar.invoke(Integer.valueOf(i10))).longValue();
        }
        return jArr;
    }

    public final String getString(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getStringArray(String key) {
        e0.checkNotNullParameter(key, "key");
        Object obj = this.f7482a.get(key);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        i iVar = new i(obj);
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = iVar.invoke(Integer.valueOf(i10));
        }
        return strArr;
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return hasKeyWithValueOfType(key, Object.class);
    }

    public final <T> boolean hasKeyWithValueOfType(String key, Class<T> klass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(klass, "klass");
        Object obj = this.f7482a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f7482a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ v.contentDeepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final int size() {
        return this.f7482a.size();
    }

    public final byte[] toByteArray() {
        return f7480b.toByteArrayInternalV1(this);
    }

    public String toString() {
        return o2.o(new StringBuilder("Data {"), y0.joinToString$default(this.f7482a.entrySet(), null, null, null, 0, null, new j0(8), 31, null), "}");
    }

    public b(Map<String, ?> values) {
        e0.checkNotNullParameter(values, "values");
        this.f7482a = new HashMap(values);
    }
}
