package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f79822a;

    public c(ParcelFileDescriptor parcelFileDescriptor) {
        this.f79822a = parcelFileDescriptor;
    }

    @Override // org.chromium.net.e
    public FileChannel getChannel() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f79822a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }
}
