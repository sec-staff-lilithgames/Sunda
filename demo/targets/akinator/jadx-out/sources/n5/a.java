package n5;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f75634a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f75635b;

    /* renamed from: c, reason: collision with root package name */
    public final f f75636c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f75637d;

    /* renamed from: e, reason: collision with root package name */
    public final File f75638e;

    /* renamed from: f, reason: collision with root package name */
    public final String f75639f;

    /* renamed from: g, reason: collision with root package name */
    public final String f75640g;

    /* renamed from: h, reason: collision with root package name */
    public final String f75641h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f75642i = false;

    /* renamed from: j, reason: collision with root package name */
    public b[] f75643j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f75644k;

    public a(AssetManager assetManager, Executor executor, f fVar, String str, String str2, String str3, File file) {
        byte[] bArr;
        this.f75634a = assetManager;
        this.f75635b = executor;
        this.f75636c = fVar;
        this.f75639f = str;
        this.f75640g = str2;
        this.f75641h = str3;
        this.f75638e = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = i.f75663g;
                    break;
                case 26:
                    bArr = i.f75662f;
                    break;
                case 27:
                    bArr = i.f75661e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = i.f75660d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = i.f75659c;
        }
        this.f75637d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f75636c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    public final void b(Serializable serializable, int i10) {
        this.f75635b.execute(new androidx.browser.customtabs.h(this, i10, serializable, 10));
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.f75637d == null) {
            b(Integer.valueOf(Build.VERSION.SDK_INT), 3);
            return false;
        }
        File file = this.f75638e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    b(null, 4);
                    return false;
                }
            } catch (IOException unused) {
                b(null, 4);
                return false;
            }
        } else if (!file.canWrite()) {
            b(null, 4);
            return false;
        }
        this.f75642i = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n5.a read() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.read():n5.a");
    }

    public a transcodeIfNeeded() throws IOException {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        f fVar = this.f75636c;
        b[] bVarArr = this.f75643j;
        if (bVarArr == null || (bArr = this.f75637d) == null) {
            return this;
        }
        if (!this.f75642i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(i.f75657a);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            fVar.onResultReceived(7, e10);
        } catch (IllegalStateException e11) {
            fVar.onResultReceived(8, e11);
        }
        if (i.n(byteArrayOutputStream, bArr, bVarArr)) {
            this.f75644k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f75643j = null;
            return this;
        }
        fVar.onResultReceived(5, null);
        this.f75643j = null;
        byteArrayOutputStream.close();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean write() {
        byte[] bArr = this.f75644k;
        if (bArr != null) {
            if (!this.f75642i) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f75638e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int i10 = byteArrayInputStream.read(bArr2);
                                                if (i10 <= 0) {
                                                    b(null, 1);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, i10);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e10) {
                    b(e10, 6);
                    return false;
                } catch (IOException e11) {
                    b(e11, 7);
                    return false;
                }
            } finally {
                this.f75644k = null;
                this.f75643j = null;
            }
        }
        return false;
    }
}
