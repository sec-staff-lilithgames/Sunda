package g6;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final z.f f57330a;

    /* renamed from: b, reason: collision with root package name */
    public final z.f f57331b;

    /* renamed from: c, reason: collision with root package name */
    public final z.f f57332c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends RuntimeException {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public d(z.f fVar, z.f fVar2, z.f fVar3) {
        this.f57330a = fVar;
        this.f57331b = fVar2;
        this.f57332c = fVar3;
    }

    public static int d(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Parcelable) {
            return 2;
        }
        if (obj instanceof i) {
            return 1;
        }
        if (obj instanceof Serializable) {
            return 3;
        }
        if (obj instanceof IBinder) {
            return 5;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(obj.getClass().getName().concat(" cannot be VersionedParcelled"));
    }

    public abstract d a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        z.f fVar = this.f57332c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(e3.g.k(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        fVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        z.f fVar = this.f57330a;
        Method method = (Method) fVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, d.class.getClassLoader()).getDeclaredMethod("read", d.class);
        fVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract void closeField();

    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        z.f fVar = this.f57331b;
        Method method = (Method) fVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, d.class);
        fVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Object[] f(Object[] objArr) {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        if (i10 != 0) {
            int i11 = readInt();
            if (i10 < 0) {
                return null;
            }
            if (i11 == 1) {
                while (i10 > 0) {
                    arrayList.add(j());
                    i10--;
                }
            } else if (i11 == 2) {
                while (i10 > 0) {
                    arrayList.add(readParcelable());
                    i10--;
                }
            } else if (i11 == 3) {
                while (i10 > 0) {
                    arrayList.add(i());
                    i10--;
                }
            } else if (i11 == 4) {
                while (i10 > 0) {
                    arrayList.add(readString());
                    i10--;
                }
            } else if (i11 == 5) {
                while (i10 > 0) {
                    arrayList.add(readStrongBinder());
                    i10--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    public abstract CharSequence g();

    public final Collection h(Collection collection) {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        if (i10 != 0) {
            int i11 = readInt();
            if (i10 < 0) {
                return null;
            }
            if (i11 == 1) {
                while (i10 > 0) {
                    collection.add(j());
                    i10--;
                }
            } else if (i11 == 2) {
                while (i10 > 0) {
                    collection.add(readParcelable());
                    i10--;
                }
            } else if (i11 == 3) {
                while (i10 > 0) {
                    collection.add(i());
                    i10--;
                }
            } else if (i11 == 4) {
                while (i10 > 0) {
                    collection.add(readString());
                    i10--;
                }
            } else if (i11 == 5) {
                while (i10 > 0) {
                    collection.add(readStrongBinder());
                    i10--;
                }
            }
        }
        return collection;
    }

    public final Serializable i() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new c(new ByteArrayInputStream(readByteArray())).readObject();
        } catch (IOException e10) {
            throw new RuntimeException(a.b.l("VersionedParcelable encountered IOException reading a Serializable object (name = ", string, ")"), e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(a.b.l("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", string, ")"), e11);
        }
    }

    public boolean isStream() {
        return false;
    }

    public final i j() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (i) c(string).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public final void k(Object[] objArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (objArr == null) {
            writeInt(-1);
            return;
        }
        int length = objArr.length;
        writeInt(length);
        if (length > 0) {
            int i10 = 0;
            int iD = d(objArr[0]);
            writeInt(iD);
            if (iD == 1) {
                while (i10 < length) {
                    o((i) objArr[i10]);
                    i10++;
                }
                return;
            }
            if (iD == 2) {
                while (i10 < length) {
                    writeParcelable((Parcelable) objArr[i10]);
                    i10++;
                }
                return;
            }
            if (iD == 3) {
                while (i10 < length) {
                    n((Serializable) objArr[i10]);
                    i10++;
                }
            } else if (iD == 4) {
                while (i10 < length) {
                    writeString((String) objArr[i10]);
                    i10++;
                }
            } else {
                if (iD != 5) {
                    return;
                }
                while (i10 < length) {
                    writeStrongBinder((IBinder) objArr[i10]);
                    i10++;
                }
            }
        }
    }

    public abstract void l(CharSequence charSequence);

    public final void m(Collection collection) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int iD = d(collection.iterator().next());
            writeInt(iD);
            switch (iD) {
                case 1:
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        o((i) it.next());
                    }
                    break;
                case 2:
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        n((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    public final void n(Serializable serializable) throws IOException {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException(a.b.l("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e10);
        }
    }

    public final void o(i iVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (iVar == null) {
            writeString(null);
            return;
        }
        try {
            writeString(b(iVar.getClass()).getName());
            d dVarA = a();
            try {
                e(iVar.getClass()).invoke(null, iVar, dVarA);
                dVarA.closeField();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(iVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }

    public <T> T[] readArray(T[] tArr, int i10) {
        return !readField(i10) ? tArr : (T[]) f(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z10, int i10) {
        return !readField(i10) ? z10 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i10) {
        if (!readField(i10)) {
            return zArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        boolean[] zArr2 = new boolean[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zArr2[i12] = readInt() != 0;
        }
        return zArr2;
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i10) {
        return !readField(i10) ? bundle : readBundle();
    }

    public byte readByte(byte b10, int i10) {
        return !readField(i10) ? b10 : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i10) {
        return !readField(i10) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i10) {
        if (!readField(i10)) {
            return cArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        char[] cArr2 = new char[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            cArr2[i12] = (char) readInt();
        }
        return cArr2;
    }

    public CharSequence readCharSequence(CharSequence charSequence, int i10) {
        return !readField(i10) ? charSequence : g();
    }

    public abstract double readDouble();

    public double readDouble(double d10, int i10) {
        return !readField(i10) ? d10 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i10) {
        if (!readField(i10)) {
            return dArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        double[] dArr2 = new double[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            dArr2[i12] = readDouble();
        }
        return dArr2;
    }

    public Exception readException(Exception exc, int i10) {
        int i11;
        if (!readField(i10) || (i11 = readInt()) == 0) {
            return exc;
        }
        String string = readString();
        switch (i11) {
            case -9:
                return (Exception) readParcelable();
            case AppLovinErrorCodes.INVALID_AD_TOKEN /* -8 */:
            default:
                return new RuntimeException("Unknown exception code: " + i11 + " msg " + string);
            case AppLovinErrorCodes.INVALID_ZONE /* -7 */:
                return new UnsupportedOperationException(string);
            case AppLovinErrorCodes.UNABLE_TO_RENDER_AD /* -6 */:
                return new NetworkOnMainThreadException();
            case C.RESULT_FORMAT_READ /* -5 */:
                return new IllegalStateException(string);
            case C.RESULT_BUFFER_READ /* -4 */:
                return new NullPointerException(string);
            case -3:
                return new IllegalArgumentException(string);
            case -2:
                return new BadParcelableException(string);
            case -1:
                return new SecurityException(string);
        }
    }

    public abstract boolean readField(int i10);

    public abstract float readFloat();

    public float readFloat(float f10, int i10) {
        return !readField(i10) ? f10 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i10) {
        if (!readField(i10)) {
            return fArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        float[] fArr2 = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr2[i12] = readFloat();
        }
        return fArr2;
    }

    public abstract int readInt();

    public int readInt(int i10, int i11) {
        return !readField(i11) ? i10 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i10) {
        if (!readField(i10)) {
            return iArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr2[i12] = readInt();
        }
        return iArr2;
    }

    public <T> List<T> readList(List<T> list, int i10) {
        return !readField(i10) ? list : (List) h(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j10, int i10) {
        return !readField(i10) ? j10 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i10) {
        if (!readField(i10)) {
            return jArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            jArr2[i12] = readLong();
        }
        return jArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i10) {
        if (!readField(i10)) {
            return map;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        z.f fVar = new z.f();
        if (i11 != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            h(arrayList);
            h(arrayList2);
            for (int i12 = 0; i12 < i11; i12++) {
                fVar.put(arrayList.get(i12), arrayList2.get(i12));
            }
        }
        return fVar;
    }

    public abstract Parcelable readParcelable();

    public <T extends Parcelable> T readParcelable(T t10, int i10) {
        return !readField(i10) ? t10 : (T) readParcelable();
    }

    public <T> Set<T> readSet(Set<T> set, int i10) {
        return !readField(i10) ? set : (Set) h(new z.g());
    }

    public Size readSize(Size size, int i10) {
        if (!readField(i10)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    public SizeF readSizeF(SizeF sizeF, int i10) {
        if (!readField(i10)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i10) {
        if (!readField(i10)) {
            return sparseBooleanArray;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i10) {
        return !readField(i10) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i10) {
        return !readField(i10) ? iBinder : readStrongBinder();
    }

    public <T extends i> T readVersionedParcelable(T t10, int i10) {
        return !readField(i10) ? t10 : (T) j();
    }

    public abstract void setOutputField(int i10);

    public <T> void writeArray(T[] tArr, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i10);
        k(tArr);
    }

    public abstract void writeBoolean(boolean z10);

    public void writeBoolean(boolean z10, int i10) {
        setOutputField(i10);
        writeBoolean(z10);
    }

    public void writeBooleanArray(boolean[] zArr, int i10) {
        setOutputField(i10);
        if (zArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(zArr.length);
        for (boolean z10 : zArr) {
            writeInt(z10 ? 1 : 0);
        }
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i10) {
        setOutputField(i10);
        writeBundle(bundle);
    }

    public void writeByte(byte b10, int i10) {
        setOutputField(i10);
        writeInt(b10);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i10) {
        setOutputField(i10);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i10, int i11);

    public void writeCharArray(char[] cArr, int i10) {
        setOutputField(i10);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c10 : cArr) {
            writeInt(c10);
        }
    }

    public void writeCharSequence(CharSequence charSequence, int i10) {
        setOutputField(i10);
        l(charSequence);
    }

    public abstract void writeDouble(double d10);

    public void writeDouble(double d10, int i10) {
        setOutputField(i10);
        writeDouble(d10);
    }

    public void writeDoubleArray(double[] dArr, int i10) {
        setOutputField(i10);
        if (dArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(dArr.length);
        for (double d10 : dArr) {
            writeDouble(d10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i10) {
        setOutputField(i10);
        int i11 = 0;
        if (exc == 0) {
            writeInt(0);
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i11 = -9;
        } else if (exc instanceof SecurityException) {
            i11 = -1;
        } else if (exc instanceof BadParcelableException) {
            i11 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i11 = -3;
        } else if (exc instanceof NullPointerException) {
            i11 = -4;
        } else if (exc instanceof IllegalStateException) {
            i11 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i11 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i11 = -7;
        }
        writeInt(i11);
        if (i11 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i11 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f10);

    public void writeFloat(float f10, int i10) {
        setOutputField(i10);
        writeFloat(f10);
    }

    public void writeFloatArray(float[] fArr, int i10) {
        setOutputField(i10);
        if (fArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(fArr.length);
        for (float f10 : fArr) {
            writeFloat(f10);
        }
    }

    public abstract void writeInt(int i10);

    public void writeInt(int i10, int i11) {
        setOutputField(i11);
        writeInt(i10);
    }

    public void writeIntArray(int[] iArr, int i10) {
        setOutputField(i10);
        if (iArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(iArr.length);
        for (int i11 : iArr) {
            writeInt(i11);
        }
    }

    public <T> void writeList(List<T> list, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i10);
        m(list);
    }

    public abstract void writeLong(long j10);

    public void writeLong(long j10, int i10) {
        setOutputField(i10);
        writeLong(j10);
    }

    public void writeLongArray(long[] jArr, int i10) {
        setOutputField(i10);
        if (jArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(jArr.length);
        for (long j10 : jArr) {
            writeLong(j10);
        }
    }

    public <K, V> void writeMap(Map<K, V> map, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i10);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        m(arrayList);
        m(arrayList2);
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i10) {
        setOutputField(i10);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i10) throws IOException {
        setOutputField(i10);
        n(serializable);
    }

    public <T> void writeSet(Set<T> set, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i10);
        m(set);
    }

    public void writeSize(Size size, int i10) {
        setOutputField(i10);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    public void writeSizeF(SizeF sizeF, int i10) {
        setOutputField(i10);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i10) {
        setOutputField(i10);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            writeInt(sparseBooleanArray.keyAt(i11));
            writeBoolean(sparseBooleanArray.valueAt(i11));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i10) {
        setOutputField(i10);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i10) {
        setOutputField(i10);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i10) {
        setOutputField(i10);
        writeStrongInterface(iInterface);
    }

    public void writeVersionedParcelable(i iVar, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i10);
        o(iVar);
    }

    public void writeByteArray(byte[] bArr, int i10, int i11, int i12) {
        setOutputField(i12);
        writeByteArray(bArr, i10, i11);
    }

    public void setSerializationFlags(boolean z10, boolean z11) {
    }
}
