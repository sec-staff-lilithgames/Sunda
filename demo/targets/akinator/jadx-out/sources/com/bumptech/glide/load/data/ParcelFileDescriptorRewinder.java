package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ParcelFileDescriptorRewinder implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f16583a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f16584a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f16584a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            ParcelFileDescriptor parcelFileDescriptor = this.f16584a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements f {
        @Override // com.bumptech.glide.load.data.f
        public Class<ParcelFileDescriptor> getDataClass() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.f
        public g build(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16583a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean isSupported() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.g
    public ParcelFileDescriptor rewindAndGet() throws IOException {
        return this.f16583a.rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }
}
