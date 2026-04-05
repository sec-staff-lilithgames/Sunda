package n5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f75666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75667b;

    /* renamed from: c, reason: collision with root package name */
    public final long f75668c;

    /* renamed from: d, reason: collision with root package name */
    public final long f75669d;

    public k(int i10, int i11, long j10, long j11) {
        this.f75666a = i10;
        this.f75667b = i11;
        this.f75668c = j10;
        this.f75669d = j11;
    }

    public static k a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f75666a);
            dataOutputStream.writeInt(this.f75667b);
            dataOutputStream.writeLong(this.f75668c);
            dataOutputStream.writeLong(this.f75669d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f75667b == kVar.f75667b && this.f75668c == kVar.f75668c && this.f75666a == kVar.f75666a && this.f75669d == kVar.f75669d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f75667b), Long.valueOf(this.f75668c), Integer.valueOf(this.f75666a), Long.valueOf(this.f75669d));
    }
}
