package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcdp extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcdn {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcdo zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcdp(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        zzcdo zzcdoVar = new zzcdo(context);
        this.zzb = zzcdoVar;
        zzcdoVar.zzc(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    private static final void zzj(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    private static final void zzk(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        zzh("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
                sb2.append("Could not compile shader ");
                sb2.append(i10);
                sb2.append(":");
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zza() {
        Object obj = this.zzv;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void zzb(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zzn = i10;
        this.zzm = i11;
        this.zzp = surfaceTexture;
    }

    public final void zzc(int i10, int i11) {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzn = i10;
            this.zzm = i11;
            this.zzA = true;
            obj.notifyAll();
        }
    }

    public final void zzd() {
        Object obj = this.zzv;
        synchronized (obj) {
            this.zzB = true;
            this.zzp = null;
            obj.notifyAll();
        }
    }

    public final SurfaceTexture zze() throws InterruptedException {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzf(float f10, float f11) {
        int i10 = this.zzn;
        int i11 = this.zzm;
        if (i10 <= i11) {
            i10 = i11;
        }
        float f12 = i10;
        this.zzk -= (f10 * 1.7453293f) / f12;
        float f13 = this.zzl - ((f11 * 1.7453293f) / f12);
        this.zzl = f13;
        if (f13 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    public final boolean zzg() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            zEglDestroyContext |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.zzw.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.zzx = null;
        return zEglTerminate;
    }
}
