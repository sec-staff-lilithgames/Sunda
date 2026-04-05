package t5;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.e0;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements y5.g, o5.m {

    /* renamed from: b, reason: collision with root package name */
    public final Context f86377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86378c;

    /* renamed from: e, reason: collision with root package name */
    public final File f86379e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f86380f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86381g;

    /* renamed from: h, reason: collision with root package name */
    public final y5.g f86382h;

    /* renamed from: i, reason: collision with root package name */
    public o5.l f86383i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f86384j;

    public v(Context context, String str, File file, Callable<InputStream> callable, int i10, y5.g delegate) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(delegate, "delegate");
        this.f86377b = context;
        this.f86378c = str;
        this.f86379e = file;
        this.f86380f = callable;
        this.f86381g = i10;
        this.f86382h = delegate;
    }

    public final void a(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        Context context = this.f86377b;
        String str = this.f86378c;
        if (str != null) {
            readableByteChannelNewChannel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f86379e;
            if (file2 != null) {
                readableByteChannelNewChannel = new FileInputStream(file2).getChannel();
            } else {
                Callable callable = this.f86380f;
                if (callable == null) {
                    throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                }
                try {
                    readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                } catch (Exception e10) {
                    throw new IOException("inputStreamCallable exception on call", e10);
                }
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        e0.checkNotNull(channel);
        u5.j.copy(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        e0.checkNotNull(fileCreateTempFile);
        o5.l lVar = this.f86383i;
        if (lVar == null) {
            e0.throwUninitializedPropertyAccessException("databaseConfiguration");
            lVar = null;
        }
        if (lVar.f77637q != null) {
            try {
                int version = u5.c.readVersion(fileCreateTempFile);
                y5.g gVarCreate = new z5.g().create(y5.e.f94075f.builder(context).name(fileCreateTempFile.getAbsolutePath()).callback(new u(version, qv.v.coerceAtLeast(version, 1))).build());
                try {
                    y5.c writableDatabase = z10 ? gVarCreate.getWritableDatabase() : gVarCreate.getReadableDatabase();
                    o5.l lVar2 = this.f86383i;
                    if (lVar2 == null) {
                        e0.throwUninitializedPropertyAccessException("databaseConfiguration");
                        lVar2 = null;
                    }
                    y0.e eVar = lVar2.f77637q;
                    e0.checkNotNull(eVar);
                    eVar.onOpenPrepackagedDatabase(writableDatabase);
                    gv.d.closeFinally(gVarCreate, null);
                } finally {
                }
            } catch (IOException e11) {
                throw new RuntimeException("Malformed database file, unable to read version.", e11);
            }
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final void b(boolean z10) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context context = this.f86377b;
        File databasePath = context.getDatabasePath(databaseName);
        o5.l lVar = this.f86383i;
        o5.l lVar2 = null;
        if (lVar == null) {
            e0.throwUninitializedPropertyAccessException("databaseConfiguration");
            lVar = null;
        }
        b6.a aVar = new b6.a(databaseName, context.getFilesDir(), lVar.f77643w);
        try {
            b6.a.lock$default(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    e0.checkNotNull(databasePath);
                    a(databasePath, z10);
                    aVar.unlock();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                e0.checkNotNull(databasePath);
                int version = u5.c.readVersion(databasePath);
                int i10 = this.f86381g;
                if (version == i10) {
                    aVar.unlock();
                    return;
                }
                o5.l lVar3 = this.f86383i;
                if (lVar3 == null) {
                    e0.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    lVar2 = lVar3;
                }
                if (lVar2.isMigrationRequired(version, i10)) {
                    aVar.unlock();
                    return;
                }
                if (context.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.unlock();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.unlock();
                return;
            }
        } catch (Throwable th2) {
            aVar.unlock();
            throw th2;
        }
        aVar.unlock();
        throw th2;
    }

    @Override // y5.g, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f86384j = false;
    }

    @Override // y5.g
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // o5.m
    public y5.g getDelegate() {
        return this.f86382h;
    }

    @Override // y5.g
    public y5.c getReadableDatabase() throws IOException {
        if (!this.f86384j) {
            b(false);
            this.f86384j = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // y5.g
    public y5.c getWritableDatabase() throws IOException {
        if (!this.f86384j) {
            b(true);
            this.f86384j = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(o5.l databaseConfiguration) {
        e0.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f86383i = databaseConfiguration;
    }

    @Override // y5.g
    public void setWriteAheadLoggingEnabled(boolean z10) {
        getDelegate().setWriteAheadLoggingEnabled(z10);
    }
}
