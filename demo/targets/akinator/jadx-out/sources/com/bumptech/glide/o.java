package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.q;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import n8.x;
import n8.y;
import u8.a1;
import u8.b;
import u8.b1;
import u8.d;
import u8.d1;
import u8.f0;
import u8.f1;
import u8.j;
import u8.m0;
import u8.n;
import u8.u;
import u8.v0;
import u8.z;
import u8.z0;
import v8.a;
import v8.b;
import v8.c;
import v8.i;
import x8.a0;
import x8.e0;
import x8.h1;
import x8.l0;
import x8.n0;
import x8.p0;
import x8.r0;
import x8.y0;
import y8.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class o {
    public static m a(c cVar, List list, d9.a aVar) {
        x gVar;
        x r0Var;
        String str;
        m mVar;
        q8.d bitmapPool = cVar.getBitmapPool();
        q8.b arrayPool = cVar.getArrayPool();
        h hVar = cVar.f16537f;
        Context applicationContext = hVar.getApplicationContext();
        i experiments = hVar.getExperiments();
        m mVar2 = new m();
        mVar2.register(new x8.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            mVar2.register(new e0());
        }
        Resources resources = applicationContext.getResources();
        List<n8.g> imageHeaderParsers = mVar2.getImageHeaderParsers();
        b9.a aVar2 = new b9.a(applicationContext, imageHeaderParsers, bitmapPool, arrayPool);
        x xVarParcel = h1.parcel(bitmapPool);
        a0 a0Var = new a0(mVar2.getImageHeaderParsers(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
        if (i10 < 28 || !experiments.isEnabled(f.class)) {
            gVar = new x8.g(a0Var);
            r0Var = new r0(a0Var, arrayPool);
        } else {
            r0Var = new l0();
            gVar = new x8.h();
        }
        if (i10 >= 28) {
            mVar2.append("Animation", InputStream.class, Drawable.class, z8.d.streamDecoder(imageHeaderParsers, arrayPool));
            mVar2.append("Animation", ByteBuffer.class, Drawable.class, z8.d.byteBufferDecoder(imageHeaderParsers, arrayPool));
        }
        z8.h hVar2 = new z8.h(applicationContext);
        x8.c cVar2 = new x8.c(arrayPool);
        c9.a aVar3 = new c9.a();
        c9.d dVar = new c9.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        mVar2.append(ByteBuffer.class, new u8.h()).append(InputStream.class, new z0(arrayPool)).append("Bitmap", ByteBuffer.class, Bitmap.class, gVar).append("Bitmap", InputStream.class, Bitmap.class, r0Var);
        if (ParcelFileDescriptorRewinder.isSupported()) {
            str = "Animation";
            mVar2.append("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new n0(a0Var));
        } else {
            str = "Animation";
        }
        mVar2.append("Bitmap", AssetFileDescriptor.class, Bitmap.class, h1.asset(bitmapPool));
        String str2 = str;
        mVar2.append("Bitmap", ParcelFileDescriptor.class, Bitmap.class, xVarParcel).append(Bitmap.class, Bitmap.class, b1.a.getInstance()).append("Bitmap", Bitmap.class, Bitmap.class, new y0()).append(Bitmap.class, (y) cVar2).append("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new x8.a(resources, gVar)).append("BitmapDrawable", InputStream.class, BitmapDrawable.class, new x8.a(resources, r0Var)).append("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new x8.a(resources, xVarParcel)).append(BitmapDrawable.class, (y) new x8.b(bitmapPool, cVar2)).append(str2, InputStream.class, b9.d.class, new b9.n(imageHeaderParsers, aVar2, arrayPool)).append(str2, ByteBuffer.class, b9.d.class, aVar2).append(b9.d.class, (y) new b9.e()).append(m8.b.class, m8.b.class, b1.a.getInstance()).append("Bitmap", m8.b.class, Bitmap.class, new b9.l(bitmapPool)).append(Uri.class, Drawable.class, hVar2).append(Uri.class, Bitmap.class, new p0(hVar2, bitmapPool)).register(new a.C0813a()).append(File.class, ByteBuffer.class, new j.a()).append(File.class, InputStream.class, new u.c()).append(File.class, File.class, new a9.a()).append(File.class, ParcelFileDescriptor.class, new u.b()).append(File.class, File.class, b1.a.getInstance()).register(new q.a(arrayPool));
        if (ParcelFileDescriptorRewinder.isSupported()) {
            mVar = mVar2;
            mVar.register(new ParcelFileDescriptorRewinder.a());
        } else {
            mVar = mVar2;
        }
        m0 m0VarInputStreamFactory = u8.t.inputStreamFactory(applicationContext);
        m0 m0VarAssetFileDescriptorFactory = u8.t.assetFileDescriptorFactory(applicationContext);
        m0 m0VarDrawableFactory = u8.t.drawableFactory(applicationContext);
        Class cls = Integer.TYPE;
        mVar.append(cls, InputStream.class, m0VarInputStreamFactory).append(Integer.class, InputStream.class, m0VarInputStreamFactory).append(cls, AssetFileDescriptor.class, m0VarAssetFileDescriptorFactory).append(Integer.class, AssetFileDescriptor.class, m0VarAssetFileDescriptorFactory).append(cls, Drawable.class, m0VarDrawableFactory).append(Integer.class, Drawable.class, m0VarDrawableFactory).append(Uri.class, InputStream.class, u8.y0.newStreamFactory(applicationContext)).append(Uri.class, AssetFileDescriptor.class, u8.y0.newAssetFileDescriptorFactory(applicationContext));
        v0.c cVar3 = new v0.c(resources);
        v0.a aVar4 = new v0.a(resources);
        v0.b bVar = new v0.b(resources);
        mVar.append(Integer.class, Uri.class, cVar3).append(cls, Uri.class, cVar3).append(Integer.class, AssetFileDescriptor.class, aVar4).append(cls, AssetFileDescriptor.class, aVar4).append(Integer.class, InputStream.class, bVar).append(cls, InputStream.class, bVar);
        mVar.append(String.class, InputStream.class, new n.a()).append(Uri.class, InputStream.class, new n.a()).append(String.class, InputStream.class, new a1.c()).append(String.class, ParcelFileDescriptor.class, new a1.b()).append(String.class, AssetFileDescriptor.class, new a1.a()).append(Uri.class, InputStream.class, new b.C0794b(applicationContext.getAssets())).append(Uri.class, AssetFileDescriptor.class, new b.a(applicationContext.getAssets())).append(Uri.class, InputStream.class, new b.a(applicationContext)).append(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i10 >= 29) {
            mVar.append(Uri.class, InputStream.class, new v8.f(applicationContext));
            mVar.append(Uri.class, ParcelFileDescriptor.class, new v8.e(applicationContext));
        }
        mVar.append(Uri.class, InputStream.class, new d1.c(contentResolver)).append(Uri.class, ParcelFileDescriptor.class, new d1.b(contentResolver)).append(Uri.class, AssetFileDescriptor.class, new d1.a(contentResolver)).append(Uri.class, InputStream.class, new f1.a()).append(URL.class, InputStream.class, new i.a()).append(Uri.class, File.class, new f0.a(applicationContext)).append(z.class, InputStream.class, new a.C0800a()).append(byte[].class, ByteBuffer.class, new d.a()).append(byte[].class, InputStream.class, new d.b()).append(Uri.class, Uri.class, b1.a.getInstance()).append(Drawable.class, Drawable.class, b1.a.getInstance()).append(Drawable.class, Drawable.class, new z8.i()).register(Bitmap.class, BitmapDrawable.class, new c9.b(resources)).register(Bitmap.class, byte[].class, aVar3).register(Drawable.class, byte[].class, new c9.c(bitmapPool, aVar3, dVar)).register(b9.d.class, byte[].class, dVar);
        x xVarByteBuffer = h1.byteBuffer(bitmapPool);
        mVar.append(ByteBuffer.class, Bitmap.class, xVarByteBuffer);
        mVar.append(ByteBuffer.class, BitmapDrawable.class, new x8.a(resources, xVarByteBuffer));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        if (aVar != null) {
            aVar.registerComponents(applicationContext, cVar, mVar);
        }
        return mVar;
    }
}
