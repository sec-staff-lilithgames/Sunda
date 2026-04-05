package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class CJ extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC2005eS {
    public static byte[] A0O;
    public static String[] A0P = {"8kg0gsxxraVcY9760AfDDdqqLp5YK9AT", "N8j2Ddyx", "HVNw4PtkXrEg8LlUN7XWbo", "maxPy5SeUtgOYTWaW", "FkAKyJNQQf2eCz2ilXM7tuAli1jbjSs3", "vA9Mb9Xk6BXUb", "TQHC", "vy65DpAohCvDmaIHVnToJ2EB52e80kqi"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public EnumC1953db A0B;
    public EnumC2007eU A0C;
    public EnumC2007eU A0D;
    public InterfaceC2008eV A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final C1937dL A0N;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0O = new byte[]{115, 125, 113, 115, -74, -55, -59, -61, -78, 115, 113, -117, 113, 115, -54, 37, -115, -85, -72, -72, -71, -66, 106, -70, -68, -81, -70, -85, -68, -81, 106, -73, -81, -82, -77, -85, 106, -70, -74, -85, -61, -81, -68, 106, -63, -77, -66, -78, 106, -99, -65, -68, -80, -85, -83, -81, -98, -81, -62, -66, -65, -68, -81, -124, 106, -70, -26, -20, -29, -37, -27, -98, -21, -105, -23, -36, -21, -23, -32, -36, -19, -36, -105, -19, -32, -37, -36, -26, -105, -32, -27, -35, -26, -23, -28, -40, -21, -32, -26, -27, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -6, -5, -16, -7, -85, -20, -2, -2, -16, -1, -2, -104, -64, -64, -72, -67, -74, 113, -78, -67, -56, -78, -54, -60, 113, -59, -71, -61, -64, -56, 113, -78, -65, 113, -74, -55, -76, -74, -63, -59, -70, -64, -65, 113, -56, -70, -59, -71, 113, -60, -74, -59, -109, -78, -76, -68, -72, -61, -64, -58, -65, -75, -107, -61, -78, -56, -78, -77, -67, -74, 113, -64, -65, 113, -97, -64, -58, -72, -78, -59, 113, -78, -77, -64, -57, -74, AbstractJsonLexerKt.TC_INVALID, 113, -60, -64, 113, -56, -74, 113, -60, -70, -67, -74, -65, -59, -67, -54, 113, -70, -72, -65, -64, -61, -74, 113, -70, -59, AbstractJsonLexerKt.TC_INVALID, -23, 17, 17, 9, 14, 7, -62, 3, 14, 25, 3, 27, 21, -62, 22, 10, 20, 17, 25, -62, 3, 16, -62, 7, 26, 5, 7, 18, 22, 11, 17, 16, -62, 25, 11, 22, 10, -62, 21, 7, 22, -24, 17, 20, 7, 9, 20, 17, 23, 16, 6, -62, 17, 16, -62, -16, 17, 23, 9, 3, 22, -62, 3, 4, 17, 24, 7, -48, -62, 21, 17, -62, 25, 7, -62, 21, 11, 14, 7, 16, 22, 14, 27, -62, 11, 9, 16, 17, 20, 7, -62, 11, 22, -48, -47, -22, -35, -34, -24, -31, -100, -16, -21, -100, -33, -24, -21, -17, -31, -13, 16, 7, -66, 17, 6, 13, 19, 10, 2, -66, 12, 13, 18, -66, 0, 3, -66, 3, 11, 14, 18, 23, -52, -4, 15, 10, 11, 21, -58, 25, 26, 7, 26, 11, -58, 9, 14, 7, 20, 13, 11, 10, -58, 26, 21, -58, -97, -79, -79, -93, -78, 26, 22, 11, 35, 15, 28, 12, -77, 8, -7, -14, 5, -77, -79, -53, -79, -77};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (U7.A1v(this.A0N)) {
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[4].charAt(10) != '2') {
                throw new RuntimeException();
            }
            A0P[4] = "ZKmo0lxTtT2mJSQRRhI8B7lsvNxlt9ka";
            if (mediaPlayer == null || !A07()) {
                return;
            }
            if (!this.A0I) {
                this.A0I = true;
                this.A0N.A0F().AIJ();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0E != null) {
                this.A0E.ADK(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A04();
        A0Q = CJ.class.getSimpleName();
    }

    public CJ(C1937dL c1937dL) {
        super(c1937dL);
        this.A0C = EnumC2007eU.A04;
        this.A0D = EnumC2007eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1953db.A03;
        this.A0M = new C2002eP(this);
        this.A0I = false;
        this.A0N = c1937dL;
    }

    public CJ(C1937dL c1937dL, AttributeSet attributeSet) {
        super(c1937dL, attributeSet);
        this.A0C = EnumC2007eU.A04;
        this.A0D = EnumC2007eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1953db.A03;
        this.A0M = new C2002eP(this);
        this.A0I = false;
        this.A0N = c1937dL;
    }

    public CJ(C1937dL c1937dL, AttributeSet attributeSet, int i10) {
        super(c1937dL, attributeSet, i10);
        this.A0C = EnumC2007eU.A04;
        this.A0D = EnumC2007eU.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC1953db.A03;
        this.A0M = new C2002eP(this);
        this.A0I = false;
        this.A0N = c1937dL;
    }

    private final void A05(MediaPlayer mediaPlayer, Uri uri) throws IOException {
        String uriPath;
        String strA03 = A03(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 15, 64);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    uriPath = uri.getPath();
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e10) {
                            Log.w(A0Q, strA03, e10);
                        }
                    }
                    throw th2;
                }
            } catch (IOException | SecurityException e11) {
                Log.w(A0Q, A03(100, 21, 79), e11);
                setVideoState(EnumC2007eU.A03);
                this.A0N.A0F().A3a(2);
                if (0 != 0) {
                    assetFileDescriptor.close();
                } else {
                    return;
                }
            }
            if (!TextUtils.isEmpty(uriPath)) {
                AssetFileDescriptor assetFileDescriptorOpenFd = getContext().getAssets().openFd(uriPath.substring(1));
                mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                if (assetFileDescriptorOpenFd != null) {
                    assetFileDescriptorOpenFd.close();
                    return;
                }
                return;
            }
            throw new IOException(A03(332, 24, 98));
        } catch (IOException e12) {
            String str = A0Q;
            if (A0P[6].length() != 4) {
                throw new RuntimeException();
            }
            A0P[3] = "IDdSaYeoVr3R4FZ1u";
            Log.w(str, strA03, e12);
        }
    }

    private boolean A06() {
        return (this.A0C == EnumC2007eU.A08 || this.A0C == EnumC2007eU.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == EnumC2007eU.A07 || this.A0C == EnumC2007eU.A0A || this.A0C == EnumC2007eU.A05 || this.A0C == EnumC2007eU.A06;
    }

    private boolean A08() {
        return (this.A0C == EnumC2007eU.A08 || this.A0C == EnumC2007eU.A07) ? false : true;
    }

    private boolean A09() {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.reset();
            return true;
        } catch (IllegalStateException e10) {
            this.A0N.A08().AAy(A03(384, 6, 110), AbstractC1550Sv.A2H, new C1551Sw(e10));
            return false;
        }
    }

    private boolean A0A(Surface surface) {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.setSurface(surface);
            return true;
        } catch (IllegalStateException e10) {
            this.A0N.A08().AAy(A03(384, 6, 110), AbstractC1550Sv.A2I, new C1551Sw(e10));
            return false;
        }
    }

    public final /* synthetic */ void A0C() throws IllegalStateException {
        Activity activity = this.A0N.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9V();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void A9V() throws IllegalStateException {
        if (!this.A0F) {
            AG7(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final boolean A9i() throws IllegalStateException {
        if (this.A06 == null) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e10) {
            Log.e(A0Q, A03(65, 35, 59), e10);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final boolean A9j() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final boolean AAT() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void AG7(boolean z10, int i10) throws IllegalStateException {
        this.A0N.A0F().A3W(i10);
        this.A0D = EnumC2007eU.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0J = z10;
            this.A06.pause();
            if (this.A0C != EnumC2007eU.A06) {
                setVideoState(EnumC2007eU.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC2007eU.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void AJH(int i10) throws IllegalStateException {
        this.A0N.A0F().ABy(i10);
        setVideoState(EnumC2007eU.A09);
        AJU(5);
        this.A03 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void AJM(EnumC1953db enumC1953db, int i10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.A0N.A0F().A3h(i10);
        this.A0J = false;
        this.A0D = EnumC2007eU.A0A;
        this.A0B = enumC1953db;
        if (this.A0C == EnumC2007eU.A0A || this.A0C == EnumC2007eU.A07 || this.A0C == EnumC2007eU.A04 || this.A0C == EnumC2007eU.A05 || this.A0C == EnumC2007eU.A06) {
            if (this.A06 == null) {
                setup(this.A07);
            } else {
                if (this.A03 > 0) {
                    this.A06.seekTo(this.A03);
                }
                this.A06.start();
                if (this.A0C != EnumC2007eU.A07 || this.A0K) {
                    setVideoState(EnumC2007eU.A0A);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void AJU(int i10) throws IllegalStateException {
        this.A0N.A0F().A3j(i10);
        this.A0D = EnumC2007eU.A04;
        if (this.A06 != null) {
            int currentPosition = this.A06.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            A09();
            this.A06.release();
            this.A06 = null;
            if (this.A0A != null) {
                this.A0A.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC2007eU.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            MediaPlayer mediaPlayer = this.A06;
            if (A0P[1].length() == 0) {
                throw new RuntimeException();
            }
            A0P[3] = "r7bVcQo0vwDc4SuX1";
            mediaPlayer.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(EnumC2007eU.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public int getDuration() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public EnumC1953db getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public EnumC2007eU getState() {
        return this.A0C;
    }

    public EnumC2007eU getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() throws IllegalStateException {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC2007eU.A03);
            this.A0N.A0F().A3a(5);
            AJU(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        if (this.A06 != null) {
            this.A06.pause();
        }
        setVideoState(EnumC2007eU.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.A0N.A0F().ABx(A03(390, 11, 85) + i10 + A03(0, 14, 21) + i11 + A03(14, 2, 108));
        if (this.A01 > 0 && getState() == EnumC2007eU.A0A) {
            this.A01--;
            AJU(6);
            AJM(this.A0B, 10);
        } else {
            setVideoState(EnumC2007eU.A03);
            this.A0N.A0F().A3a(1);
            AJU(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        switch (i10) {
            case 3:
                this.A0K = true;
                if (this.A0D == EnumC2007eU.A0A) {
                    setVideoState(EnumC2007eU.A0A);
                }
                return true;
            case 701:
                setVideoState(EnumC2007eU.A02);
                return false;
            case 702:
                if (!A08()) {
                    return false;
                }
                setVideoState(EnumC2007eU.A0A);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setVideoState(EnumC2007eU.A07);
        if (this.A0H && !this.A0G) {
            Activity activityA0E = this.A0N.A0E();
            if (activityA0E != null) {
                this.A0A = new MediaController(activityA0E);
                this.A0A.setAnchorView(this.A09 == null ? this : this.A09);
                this.A0A.setMediaPlayer(this.A0M);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A03 > 0) {
            int i10 = this.A03;
            int duration = ((MediaPlayer) AbstractC2114gF.A00(this.A06)).getDuration();
            if (A0P[3].length() != 17) {
                throw new RuntimeException();
            }
            A0P[5] = "vYKpudhGuKF00mC0lqJEZv1Z";
            if (i10 >= duration) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        if (this.A0D == EnumC2007eU.A0A) {
            AJM(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.A0E == null) {
            return;
        }
        this.A0E.AF9(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(EnumC2007eU.A03);
            this.A0N.A0F().A3a(4);
            destroy();
        } else if (this.A0C == EnumC2007eU.A05 && !this.A0J) {
            AJM(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws IllegalStateException {
        A0A(null);
        if (this.A08 != null) {
            this.A08.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC2007eU.A05) {
            AG7(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWindowFocusChanged(boolean r6) throws java.lang.IllegalStateException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            super.onWindowFocusChanged(r6)
            android.media.MediaPlayer r0 = r5.A06
            if (r0 != 0) goto L8
            return
        L8:
            android.widget.MediaController r0 = r5.A0A
            if (r0 == 0) goto L15
            android.widget.MediaController r0 = r5.A0A
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L15
            return
        L15:
            if (r6 != 0) goto L42
            com.facebook.ads.redexgen.X.eU r1 = r5.A0C
            com.facebook.ads.redexgen.X.eU r0 = com.facebook.ads.redexgen.core.EnumC2007eU.A05
            if (r1 == r0) goto La6
            com.facebook.ads.redexgen.X.dL r0 = r5.A0N
            com.facebook.ads.redexgen.X.SO r0 = r0.A0H()
            boolean r0 = r0.A01()
            if (r0 != 0) goto L8d
            com.facebook.ads.redexgen.X.dL r0 = r5.A0N
            boolean r3 = com.facebook.ads.redexgen.core.U7.A1z(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.CJ.A0P
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto L84
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L42:
            com.facebook.ads.redexgen.X.eU r4 = r5.A0C
            com.facebook.ads.redexgen.X.eU r3 = com.facebook.ads.redexgen.core.EnumC2007eU.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.CJ.A0P
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L6d
            if (r4 != r3) goto La6
        L54:
            boolean r0 = r5.A0J
            if (r0 != 0) goto La6
            com.facebook.ads.redexgen.X.db r3 = r5.A0B
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.CJ.A0P
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L77
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.CJ.A0P
            java.lang.String r1 = "r8oy"
            r0 = 6
            r2[r0] = r1
            if (r4 != r3) goto La6
            goto L54
        L77:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.CJ.A0P
            java.lang.String r1 = "grk6xKjGgtFswoEyrqXB"
            r0 = 1
            r2[r0] = r1
            r0 = 9
            r5.AJM(r3, r0)
            goto La6
        L84:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.CJ.A0P
            java.lang.String r1 = "q2iXdwHPhxMMYJm8CrOmbfqNZQSE"
            r0 = 5
            r2[r0] = r1
            if (r3 == 0) goto La7
        L8d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto La7
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            com.facebook.ads.redexgen.X.eO r2 = new com.facebook.ads.redexgen.X.eO
            r2.<init>()
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        La6:
            return
        La7:
            r5.A9V()
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.CJ.onWindowFocusChanged(boolean):void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public final void seekTo(int i10) throws IllegalStateException {
        if (this.A06 != null && A07()) {
            if (i10 < getDuration() && i10 > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i10;
                this.A06.seekTo(i10);
                return;
            }
            return;
        }
        this.A03 = i10;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 102, 21));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0F = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC2004eR(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 94, 102));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setFullScreen(boolean z10) {
        this.A0H = z10;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new ViewOnTouchListenerC2003eQ(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A06 == null || this.A0C == EnumC2007eU.A08) {
            return;
        }
        EnumC2007eU enumC2007eU = this.A0C;
        String[] strArr = A0P;
        if (strArr[0].charAt(16) == strArr[7].charAt(16)) {
            throw new RuntimeException();
        }
        A0P[3] = "xC5rxgqNbqLUjjPrr";
        if (enumC2007eU != EnumC2007eU.A04) {
            this.A06.setVolume(f10, f10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setVideoMPD(String str) {
    }

    private void setVideoState(EnumC2007eU enumC2007eU) {
        if (enumC2007eU != this.A0C) {
            if (this.A0N.A05().AAF()) {
                String str = A03(356, 23, 106) + enumC2007eU;
            }
            this.A0C = enumC2007eU;
            if (this.A0E != null) {
                this.A0E.AFt(enumC2007eU);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setVideoStateChangeListener(InterfaceC2008eV interfaceC2008eV) {
        this.A0E = interfaceC2008eV;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2005eS
    public void setup(Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer;
        this.A0N.A0F().A3Z();
        this.A0K = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(EnumC2007eU.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (((String) AbstractC2114gF.A00(uri.getScheme())).equals(A03(379, 5, 2))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(EnumC2007eU.A08);
        } catch (Exception e10) {
            setVideoState(EnumC2007eU.A03);
            this.A0N.A0F().A3a(3);
            mediaPlayer.release();
            Log.e(A0Q, A03(16, 49, 14) + e10);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
