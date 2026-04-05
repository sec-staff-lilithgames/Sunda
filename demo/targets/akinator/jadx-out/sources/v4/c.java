package v4;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class c {
    public static final SimpleDateFormat T;
    public static final SimpleDateFormat U;
    public static final e Y;
    public static final e[][] Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final e[] f88988a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final HashMap[] f88989b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final HashMap[] f88990c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final HashSet f88991d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final HashMap f88992e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Charset f88993f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f88994g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f88995h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f88996i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f88997j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f88998k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f88999l0;

    /* renamed from: a, reason: collision with root package name */
    public String f89005a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f89006b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f89007c;

    /* renamed from: d, reason: collision with root package name */
    public int f89008d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f89009e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap[] f89010f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f89011g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f89012h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f89013i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f89014j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f89015k;

    /* renamed from: l, reason: collision with root package name */
    public int f89016l;

    /* renamed from: m, reason: collision with root package name */
    public int f89017m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f89018n;

    /* renamed from: o, reason: collision with root package name */
    public int f89019o;

    /* renamed from: p, reason: collision with root package name */
    public int f89020p;

    /* renamed from: q, reason: collision with root package name */
    public int f89021q;

    /* renamed from: r, reason: collision with root package name */
    public int f89022r;

    /* renamed from: s, reason: collision with root package name */
    public int f89023s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f89024t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f89025u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f89000v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    public static final List f89001w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    public static final List f89002x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f89003y = {8, 8, 8};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f89004z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {79, 76, 89, 77, 80, 0};
    public static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] H = {101, 88, 73, 102};
    public static final byte[] I = {73, 72, 68, 82};
    public static final byte[] J = {73, 69, 78, 68};
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a extends FilterOutputStream {

        /* renamed from: b, reason: collision with root package name */
        public final OutputStream f89026b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f89027c;

        public a(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f89026b = outputStream;
            this.f89027c = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.f89027c = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f89026b.write(bArr);
        }

        public void writeByte(int i10) throws IOException {
            this.f89026b.write(i10);
        }

        public void writeInt(int i10) throws IOException {
            ByteOrder byteOrder = this.f89027c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f89026b;
            if (byteOrder == byteOrder2) {
                outputStream.write(i10 & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i10 >>> 24) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write(i10 & 255);
            }
        }

        public void writeShort(short s10) throws IOException {
            ByteOrder byteOrder = this.f89027c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f89026b;
            if (byteOrder == byteOrder2) {
                outputStream.write(s10 & 255);
                outputStream.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s10 >>> 8) & 255);
                outputStream.write(s10 & 255);
            }
        }

        public void writeUnsignedInt(long j10) throws IOException {
            writeInt((int) j10);
        }

        public void writeUnsignedShort(int i10) throws IOException {
            writeShort((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f89026b.write(bArr, i10, i11);
        }
    }

    static {
        e eVar = new e("NewSubfileType", 254, 4);
        e eVar2 = new e("SubfileType", 255, 4);
        e eVar3 = new e("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4);
        e eVar4 = new e("ImageLength", 257, 3, 4);
        e eVar5 = new e("BitsPerSample", 258, 3);
        e eVar6 = new e("Compression", 259, 3);
        e eVar7 = new e("PhotometricInterpretation", 262, 3);
        e eVar8 = new e("ImageDescription", 270, 2);
        e eVar9 = new e("Make", 271, 2);
        e eVar10 = new e("Model", 272, 2);
        e eVar11 = new e("StripOffsets", 273, 3, 4);
        e eVar12 = new e("Orientation", 274, 3);
        e eVar13 = new e("SamplesPerPixel", 277, 3);
        e eVar14 = new e("RowsPerStrip", 278, 3, 4);
        e eVar15 = new e("StripByteCounts", 279, 3, 4);
        e eVar16 = new e("XResolution", 282, 5);
        e eVar17 = new e("YResolution", 283, 5);
        e eVar18 = new e("PlanarConfiguration", 284, 3);
        e eVar19 = new e("ResolutionUnit", 296, 3);
        e eVar20 = new e("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3);
        e eVar21 = new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2);
        e eVar22 = new e("DateTime", 306, 2);
        e eVar23 = new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2);
        e eVar24 = new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5);
        e eVar25 = new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5);
        e eVar26 = new e("SubIFDPointer", 330, 4);
        e eVar27 = new e("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4);
        e eVar28 = new e("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4);
        e eVar29 = new e("YCbCrCoefficients", 529, 5);
        e eVar30 = new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3);
        e eVar31 = new e("YCbCrPositioning", 531, 3);
        e eVar32 = new e("ReferenceBlackWhite", 532, 5);
        e eVar33 = new e("Copyright", 33432, 2);
        e eVar34 = new e("ExifIFDPointer", 34665, 4);
        String str = duhsDlGWdBkekB.FKpBaRa;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, new e(str, 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e(duhsDlGWdBkekB.durmX, 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new e("DateTime", 306, 2), new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4), new e("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e(str, 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        Y = new e("StripOffsets", 273, 3);
        Z = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        f88988a0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e(str, 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f88989b0 = new HashMap[10];
        f88990c0 = new HashMap[10];
        f88991d0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f88992e0 = new HashMap();
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        f88993f0 = charsetForName;
        f88994g0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f88995h0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr6 = Z;
            if (i10 >= eVarArr6.length) {
                HashMap map = f88992e0;
                e[] eVarArr7 = f88988a0;
                map.put(Integer.valueOf(eVarArr7[0].f89032a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f89032a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f89032a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f89032a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f89032a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f89032a), 8);
                f88996i0 = Pattern.compile(".*[1-9].*");
                f88997j0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f88998k0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f88999l0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f88989b0[i10] = new HashMap();
            f88990c0[i10] = new HashMap();
            for (e eVar35 : eVarArr6[i10]) {
                f88989b0[i10].put(Integer.valueOf(eVar35.f89032a), eVar35);
                f88990c0[i10].put(eVar35.f89033b, eVar35);
            }
            i10++;
        }
    }

    public c(File file) throws Throwable {
        e[][] eVarArr = Z;
        this.f89010f = new HashMap[eVarArr.length];
        this.f89011g = new HashSet(eVarArr.length);
        this.f89012h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        r(file.getAbsolutePath());
    }

    public static String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(b bVar, a aVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f88993f0;
                sb2.append(new String(bArr, charset));
                sb2.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb2.toString());
            }
            int i10 = bVar.readInt();
            aVar.write(bArr3);
            aVar.writeInt(i10);
            if (i10 % 2 == 1) {
                i10++;
            }
            jh.i.A(bVar, aVar, i10);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static boolean isSupportedMimeType(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    public static Pair p(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairP = p(strArrSplit[0]);
            if (((Integer) pairP.first).intValue() == 2) {
                return pairP;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairP2 = p(strArrSplit[i10]);
                int iIntValue = (((Integer) pairP2.first).equals(pairP.first) || ((Integer) pairP2.second).equals(pairP.first)) ? ((Integer) pairP.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairP.second).intValue() == -1 || !(((Integer) pairP2.first).equals(pairP.second) || ((Integer) pairP2.second).equals(pairP.second))) ? -1 : ((Integer) pairP.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairP = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairP = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairP;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? j10 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean s(FileDescriptor fileDescriptor) {
        try {
            h.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f89000v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static Long v(String str, String str2, String str3) throws NumberFormatException {
        long j10;
        if (str != null && f88996i0.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = T.parse(str, parsePosition);
                if (date == null && (date = U.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i10 = Integer.parseInt(str3.substring(1, 3));
                    int i11 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i10 <= 14) {
                        time += o2.B(i10, 60, i11, DtbConstants.NETWORK_READ_TIMEOUT) * ("-".equals(strSubstring) ? 1 : -1);
                    }
                }
                if (str2 != null) {
                    try {
                        int iMin = Math.min(str2.length(), 3);
                        j10 = Long.parseLong(str2.substring(0, iMin));
                        while (iMin < 3) {
                            j10 *= 10;
                            iMin++;
                        }
                    } catch (NumberFormatException unused) {
                        j10 = 0;
                    }
                    time += j10;
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    public static ByteOrder y(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z10 = f89000v;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 != 19789) {
            throw new IOException(w0.i.b(s10, new StringBuilder("Invalid byte order: ")));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void B(String str) {
        for (int i10 = 0; i10 < Z.length; i10++) {
            this.f89010f[i10].remove(str);
        }
    }

    public final void C(int i10, String str, String str2) {
        HashMap[] mapArr = this.f89010f;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f89000v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        a aVar = new a(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        aVar.writeByte(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        aVar.writeByte(-40);
        String attribute = getAttribute("Xmp");
        HashMap[] mapArr = this.f89010f;
        d dVar = (attribute == null || !this.f89025u) ? null : (d) mapArr[0].remove("Xmp");
        aVar.writeByte(-1);
        aVar.writeByte(-31);
        K(aVar);
        if (dVar != null) {
            mapArr[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                aVar.writeByte(-1);
                aVar.writeByte(b10);
                jh.i.z(bVar, aVar);
                return;
            }
            if (b10 != -31) {
                aVar.writeByte(-1);
                aVar.writeByte(b10);
                int unsignedShort = bVar.readUnsignedShort();
                aVar.writeUnsignedShort(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 >= 0) {
                        aVar.write(bArr, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f88994g0)) {
                        bVar.skipFully(unsignedShort2 - 8);
                    }
                }
                aVar.writeByte(-1);
                aVar.writeByte(b10);
                aVar.writeUnsignedShort(unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    aVar.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = bVar.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 >= 0) {
                        aVar.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f89000v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        a aVar = new a(bufferedOutputStream, byteOrder);
        jh.i.A(bVar, aVar, G.length);
        if (this.f89020p == 0) {
            int i10 = bVar.readInt();
            aVar.writeInt(i10);
            jh.i.A(bVar, aVar, i10 + 8);
        } else {
            jh.i.A(bVar, aVar, (r2 - r7.length) - 8);
            bVar.skipFully(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                a aVar2 = new a(byteArrayOutputStream2, byteOrder);
                K(aVar2);
                byte[] byteArray = ((ByteArrayOutputStream) aVar2.f89026b).toByteArray();
                aVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                aVar.writeInt((int) crc32.getValue());
                jh.i.w(byteArrayOutputStream2);
                jh.i.z(bVar, aVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                jh.i.w(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r17;
        a aVar;
        if (f89000v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        a aVar2 = new a(bufferedOutputStream, byteOrder);
        byte[] bArr = K;
        jh.i.A(bVar, aVar2, bArr.length);
        byte[] bArr2 = L;
        bVar.skipFully(bArr2.length + 4);
        b bVar2 = null;
        try {
            try {
                ?? byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    a aVar3 = new a(byteArrayOutputStream, byteOrder);
                    int i15 = this.f89020p;
                    try {
                        try {
                            if (i15 != 0) {
                                jh.i.A(bVar, aVar3, (i15 - ((bArr.length + 4) + bArr2.length)) - 8);
                                bVar.skipFully(4);
                                int i16 = bVar.readInt();
                                if (i16 % 2 != 0) {
                                    i16++;
                                }
                                bVar.skipFully(i16);
                                K(aVar3);
                            } else {
                                byte[] bArr3 = new byte[4];
                                if (bVar.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = O;
                                boolean zEquals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = Q;
                                byte[] bArr6 = P;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                        int i17 = bVar.readInt();
                                        int i18 = i17 % 2 == 1 ? i17 + 1 : i17;
                                        byte[] bArr7 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr3, bArr5);
                                        boolean z10 = true;
                                        byte[] bArr8 = N;
                                        if (zEquals2) {
                                            bVar.read(bArr7);
                                            byte[] bArr9 = new byte[3];
                                            int i19 = i18;
                                            if (bVar.read(bArr9) != 3 || !Arrays.equals(bArr8, bArr9)) {
                                                throw new IOException("Encountered error while checking VP8 signature");
                                            }
                                            i11 = bVar.readInt();
                                            i12 = (i11 << 18) >> 18;
                                            i10 = i19 - 10;
                                            i13 = (i11 << 2) >> 18;
                                            z10 = false;
                                        } else {
                                            int i20 = i18;
                                            if (!Arrays.equals(bArr3, bArr6)) {
                                                i10 = i20;
                                                i11 = 0;
                                                i12 = 0;
                                                i13 = 0;
                                                z10 = false;
                                            } else {
                                                if (bVar.readByte() != 47) {
                                                    throw new IOException("Encountered error while checking VP8L signature");
                                                }
                                                i11 = bVar.readInt();
                                                int i21 = (i11 & 16383) + 1;
                                                int i22 = ((268419072 & i11) >>> 14) + 1;
                                                if ((i11 & 268435456) == 0) {
                                                    z10 = false;
                                                }
                                                i12 = i21;
                                                i10 = i20 - 5;
                                                i13 = i22;
                                            }
                                        }
                                        aVar3.write(bArr4);
                                        aVar3.writeInt(10);
                                        byte[] bArr10 = new byte[10];
                                        if (z10) {
                                            i14 = i12;
                                            bArr10[0] = (byte) (bArr10[0] | 16);
                                        } else {
                                            i14 = i12;
                                        }
                                        bArr10[0] = (byte) (bArr10[0] | 8);
                                        int i23 = i14 - 1;
                                        r17 = byteArrayOutputStream;
                                        int i24 = i13 - 1;
                                        aVar = aVar2;
                                        try {
                                            bArr10[4] = (byte) i23;
                                            bArr10[5] = (byte) (i23 >> 8);
                                            bArr10[6] = (byte) (i23 >> 16);
                                            bArr10[7] = (byte) i24;
                                            bArr10[8] = (byte) (i24 >> 8);
                                            bArr10[9] = (byte) (i24 >> 16);
                                            aVar3.write(bArr10);
                                            aVar3.write(bArr3);
                                            aVar3.writeInt(i17);
                                        } catch (Exception e10) {
                                            e = e10;
                                            bVar = r17;
                                            bVar2 = bVar;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar = r17;
                                            bVar2 = bVar;
                                            jh.i.w(bVar2);
                                            throw th;
                                        }
                                        try {
                                            if (Arrays.equals(bArr3, bArr5)) {
                                                aVar3.write(bArr7);
                                                aVar3.write(bArr8);
                                                aVar3.writeInt(i11);
                                            } else {
                                                if (Arrays.equals(bArr3, bArr6)) {
                                                    aVar3.write(47);
                                                    aVar3.writeInt(i11);
                                                }
                                                jh.i.A(bVar, aVar3, i10);
                                                K(aVar3);
                                                r17 = r17;
                                            }
                                            jh.i.A(bVar, aVar3, i10);
                                            K(aVar3);
                                            r17 = r17;
                                        } catch (Exception e11) {
                                            e = e11;
                                            bVar2 = r17;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bVar2 = r17;
                                            jh.i.w(bVar2);
                                            throw th;
                                        }
                                    }
                                    jh.i.z(bVar, aVar3);
                                    a aVar4 = aVar;
                                    aVar4.writeInt(r17.size() + bArr2.length);
                                    aVar4.write(bArr2);
                                    ByteArrayOutputStream byteArrayOutputStream2 = r17;
                                    byteArrayOutputStream2.writeTo(aVar4);
                                    jh.i.w(byteArrayOutputStream2);
                                }
                                int i25 = bVar.readInt();
                                byte[] bArr11 = new byte[i25 % 2 == 1 ? i25 + 1 : i25];
                                bVar.read(bArr11);
                                byte b10 = (byte) (bArr11[0] | 8);
                                bArr11[0] = b10;
                                boolean z11 = ((b10 >> 1) & 1) == 1;
                                aVar3.write(bArr4);
                                aVar3.writeInt(i25);
                                aVar3.write(bArr11);
                                if (z11) {
                                    d(bVar, aVar3, R, null);
                                    while (true) {
                                        byte[] bArr12 = new byte[4];
                                        bufferedInputStream.read(bArr12);
                                        if (!Arrays.equals(bArr12, S)) {
                                            break;
                                        }
                                        int i26 = bVar.readInt();
                                        aVar3.write(bArr12);
                                        aVar3.writeInt(i26);
                                        if (i26 % 2 == 1) {
                                            i26++;
                                        }
                                        jh.i.A(bVar, aVar3, i26);
                                    }
                                    K(aVar3);
                                } else {
                                    d(bVar, aVar3, bArr5, bArr6);
                                    K(aVar3);
                                }
                            }
                            aVar = aVar2;
                            r17 = byteArrayOutputStream;
                            jh.i.z(bVar, aVar3);
                            a aVar42 = aVar;
                            aVar42.writeInt(r17.size() + bArr2.length);
                            aVar42.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream22 = r17;
                            byteArrayOutputStream22.writeTo(aVar42);
                            jh.i.w(byteArrayOutputStream22);
                        } catch (Exception e12) {
                            e = e12;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        bVar2 = byteArrayOutputStream;
                    } catch (Throwable th5) {
                        th = th5;
                        bVar2 = byteArrayOutputStream;
                    }
                } catch (Exception e14) {
                    e = e14;
                    bVar = byteArrayOutputStream;
                } catch (Throwable th6) {
                    th = th6;
                    bVar = byteArrayOutputStream;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void G(b bVar) throws Throwable {
        d dVar;
        int intValue;
        HashMap map = this.f89010f[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f89019o = 6;
            q(bVar, map);
            return;
        }
        int intValue2 = dVar2.getIntValue(this.f89012h);
        this.f89019o = intValue2;
        if (intValue2 != 1) {
            if (intValue2 == 6) {
                q(bVar, map);
                return;
            } else if (intValue2 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.a(this.f89012h);
            int[] iArr2 = f89003y;
            if (Arrays.equals(iArr2, iArr) || (this.f89008d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((intValue = dVar.getIntValue(this.f89012h)) == 1 && Arrays.equals(iArr, f89004z)) || (intValue == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrY = jh.i.y(dVar4.a(this.f89012h));
                long[] jArrY2 = jh.i.y(dVar5.a(this.f89012h));
                if (jArrY == null || jArrY.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrY2 == null || jArrY2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrY.length != jArrY2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrY2) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                this.f89015k = true;
                this.f89014j = true;
                this.f89013i = true;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < jArrY.length; i13++) {
                    int i14 = (int) jArrY[i13];
                    int i15 = (int) jArrY2[i13];
                    if (i13 < jArrY.length - 1 && i14 + i15 != jArrY[i13 + 1]) {
                        this.f89015k = false;
                    }
                    int i16 = i14 - i11;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i16;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    if (bVar.read(bArr2) != i15) {
                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                        return;
                    }
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                }
                this.f89018n = bArr;
                if (this.f89015k) {
                    this.f89016l = (int) jArrY[0];
                    this.f89017m = i10;
                    return;
                }
                return;
            }
        }
        if (f89000v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void H(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f89010f;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f89000v;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i10].get("ImageLength");
        d dVar2 = (d) mapArr[i10].get("ImageWidth");
        d dVar3 = (d) mapArr[i11].get("ImageLength");
        d dVar4 = (d) mapArr[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int intValue = dVar.getIntValue(this.f89012h);
        int intValue2 = dVar2.getIntValue(this.f89012h);
        int intValue3 = dVar3.getIntValue(this.f89012h);
        int intValue4 = dVar4.getIntValue(this.f89012h);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void I(g gVar, int i10) throws Throwable {
        d dVarCreateUShort;
        d dVarCreateUShort2;
        HashMap[] mapArr = this.f89010f;
        d dVar = (d) mapArr[i10].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i10].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i10].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i10].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f89028a == 5) {
                f[] fVarArr = (f[]) dVar.a(this.f89012h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVarCreateUShort = d.createURational(fVarArr[0], this.f89012h);
                dVarCreateUShort2 = d.createURational(fVarArr[1], this.f89012h);
            } else {
                int[] iArr = (int[]) dVar.a(this.f89012h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarCreateUShort = d.createUShort(iArr[0], this.f89012h);
                dVarCreateUShort2 = d.createUShort(iArr[1], this.f89012h);
            }
            mapArr[i10].put("ImageWidth", dVarCreateUShort);
            mapArr[i10].put("ImageLength", dVarCreateUShort2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int intValue = dVar2.getIntValue(this.f89012h);
            int intValue2 = dVar4.getIntValue(this.f89012h);
            int intValue3 = dVar5.getIntValue(this.f89012h);
            int intValue4 = dVar3.getIntValue(this.f89012h);
            if (intValue2 <= intValue || intValue3 <= intValue4) {
                return;
            }
            d dVarCreateUShort3 = d.createUShort(intValue2 - intValue, this.f89012h);
            d dVarCreateUShort4 = d.createUShort(intValue3 - intValue4, this.f89012h);
            mapArr[i10].put("ImageLength", dVarCreateUShort3);
            mapArr[i10].put("ImageWidth", dVarCreateUShort4);
            return;
        }
        d dVar6 = (d) mapArr[i10].get("ImageLength");
        d dVar7 = (d) mapArr[i10].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i10].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int intValue5 = dVar8.getIntValue(this.f89012h);
            int intValue6 = dVar8.getIntValue(this.f89012h);
            gVar.seek(intValue5);
            byte[] bArr = new byte[intValue6];
            gVar.read(bArr);
            g(new b(bArr), intValue5, i10);
        }
    }

    public final void J() throws Throwable {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.f89010f;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!t(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        C(0, "ThumbnailOrientation", "Orientation");
        C(0, "ThumbnailImageLength", "ImageLength");
        C(0, "ThumbnailImageWidth", "ImageWidth");
        C(5, "ThumbnailOrientation", "Orientation");
        C(5, "ThumbnailImageLength", "ImageLength");
        C(5, "ThumbnailImageWidth", "ImageWidth");
        C(4, "Orientation", "ThumbnailOrientation");
        C(4, "ImageLength", "ThumbnailImageLength");
        C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(a aVar) throws IOException {
        HashMap[] mapArr;
        char c10;
        char c11;
        int i10;
        int[] iArr;
        int[] iArr2;
        e[][] eVarArr = Z;
        int[] iArr3 = new int[eVarArr.length];
        int[] iArr4 = new int[eVarArr.length];
        e[] eVarArr2 = f88988a0;
        for (e eVar : eVarArr2) {
            B(eVar.f89033b);
        }
        if (this.f89013i) {
            if (this.f89014j) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i11 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f89010f;
            if (i11 >= length) {
                break;
            }
            Object[] array = mapArr[i11].entrySet().toArray();
            int length2 = array.length;
            int i12 = 0;
            while (i12 < length2) {
                Map.Entry entry = (Map.Entry) array[i12];
                if (entry.getValue() == null) {
                    iArr2 = iArr3;
                    mapArr[i11].remove(entry.getKey());
                } else {
                    iArr2 = iArr3;
                }
                i12++;
                iArr3 = iArr2;
            }
            i11++;
        }
        int[] iArr5 = iArr3;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f89033b, d.createULong(0L, this.f89012h));
        }
        if (mapArr[2].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            mapArr[0].put(eVarArr2[2].f89033b, d.createULong(0L, this.f89012h));
        }
        if (mapArr[3].isEmpty()) {
            c11 = 3;
        } else {
            c11 = 3;
            mapArr[1].put(eVarArr2[3].f89033b, d.createULong(0L, this.f89012h));
        }
        if (!this.f89013i) {
            i10 = 1;
            iArr = iArr4;
        } else if (this.f89014j) {
            mapArr[4].put("StripOffsets", d.createUShort(0, this.f89012h));
            mapArr[4].put("StripByteCounts", d.createUShort(this.f89017m, this.f89012h));
            i10 = 1;
            iArr = iArr4;
        } else {
            mapArr[4].put("JPEGInterchangeFormat", d.createULong(0L, this.f89012h));
            i10 = 1;
            iArr = iArr4;
            mapArr[4].put("JPEGInterchangeFormatLength", d.createULong(this.f89017m, this.f89012h));
        }
        for (int i13 = 0; i13 < eVarArr.length; i13++) {
            Iterator it = mapArr[i13].entrySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                int size = ((d) ((Map.Entry) it.next()).getValue()).size();
                if (size > 4) {
                    i14 += size;
                }
            }
            iArr[i13] = iArr[i13] + i14;
        }
        int size2 = 8;
        for (int i15 = 0; i15 < eVarArr.length; i15++) {
            if (!mapArr[i15].isEmpty()) {
                iArr5[i15] = size2;
                size2 = (mapArr[i15].size() * 12) + 6 + iArr[i15] + size2;
            }
        }
        if (this.f89013i) {
            if (this.f89014j) {
                mapArr[4].put("StripOffsets", d.createUShort(size2, this.f89012h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.createULong(size2, this.f89012h));
            }
            this.f89016l = size2;
            size2 += this.f89017m;
        }
        if (this.f89008d == 4) {
            size2 += 8;
        }
        if (f89000v) {
            for (int i16 = 0; i16 < eVarArr.length; i16++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i16), Integer.valueOf(iArr5[i16]), Integer.valueOf(mapArr[i16].size()), Integer.valueOf(iArr[i16]), Integer.valueOf(size2)));
            }
        }
        if (!mapArr[i10].isEmpty()) {
            mapArr[0].put(eVarArr2[i10].f89033b, d.createULong(iArr5[i10], this.f89012h));
        }
        if (!mapArr[c10].isEmpty()) {
            mapArr[0].put(eVarArr2[c10].f89033b, d.createULong(iArr5[c10], this.f89012h));
        }
        if (!mapArr[c11].isEmpty()) {
            mapArr[i10].put(eVarArr2[c11].f89033b, d.createULong(iArr5[c11], this.f89012h));
        }
        int i17 = this.f89008d;
        if (i17 == 4) {
            aVar.writeUnsignedShort(size2);
            aVar.write(f88994g0);
        } else if (i17 == 13) {
            aVar.writeInt(size2);
            aVar.write(H);
        } else if (i17 == 14) {
            aVar.write(M);
            aVar.writeInt(size2);
        }
        aVar.writeShort(this.f89012h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        aVar.setByteOrder(this.f89012h);
        aVar.writeUnsignedShort(42);
        aVar.writeUnsignedInt(8L);
        for (int i18 = 0; i18 < eVarArr.length; i18++) {
            if (!mapArr[i18].isEmpty()) {
                aVar.writeUnsignedShort(mapArr[i18].size());
                int size3 = (mapArr[i18].size() * 12) + iArr5[i18] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i18].entrySet()) {
                    int i19 = ((e) f88990c0[i18].get(entry2.getKey())).f89032a;
                    d dVar = (d) entry2.getValue();
                    int size4 = dVar.size();
                    aVar.writeUnsignedShort(i19);
                    aVar.writeUnsignedShort(dVar.f89028a);
                    aVar.writeInt(dVar.f89029b);
                    if (size4 > 4) {
                        aVar.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        aVar.write(dVar.f89031d);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                aVar.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                if (i18 != 0 || mapArr[4].isEmpty()) {
                    aVar.writeUnsignedInt(0L);
                } else {
                    aVar.writeUnsignedInt(iArr5[4]);
                }
                Iterator it2 = mapArr[i18].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f89031d;
                    if (bArr.length > 4) {
                        aVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f89013i) {
            aVar.write(getThumbnailBytes());
        }
        if (this.f89008d == 14 && size2 % 2 == i10) {
            aVar.writeByte(0);
        }
        aVar.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public final void a() {
        String attribute = getAttribute("DateTimeOriginal");
        HashMap[] mapArr = this.f89010f;
        if (attribute != null && getAttribute("DateTime") == null) {
            mapArr[0].put("DateTime", d.createString(attribute));
        }
        if (getAttribute("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.createULong(0L, this.f89012h));
        }
        if (getAttribute("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.createULong(0L, this.f89012h));
        }
        if (getAttribute("Orientation") == null) {
            mapArr[0].put("Orientation", d.createULong(0L, this.f89012h));
        }
        if (getAttribute("LightSource") == null) {
            mapArr[1].put("LightSource", d.createULong(0L, this.f89012h));
        }
    }

    public final d e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f89000v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < Z.length; i10++) {
            d dVar = (d) this.f89010f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void f(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new v4.a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f89010f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.createUShort(Integer.parseInt(strExtractMetadata), this.f89012h));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.createUShort(Integer.parseInt(strExtractMetadata2), this.f89012h));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", d.createUShort(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f89012h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.seek(i11);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f88994g0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (gVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f89020p = i13;
                    z(0, bArr2);
                }
                if (f89000v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    public void flipHorizontally() throws NumberFormatException {
        int i10 = 1;
        switch (getAttributeInt("Orientation", 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        setAttribute("Orientation", Integer.toString(i10));
    }

    public void flipVertically() throws NumberFormatException {
        int i10 = 1;
        switch (getAttributeInt("Orientation", 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        setAttribute("Orientation", Integer.toString(i10));
    }

    public double getAltitude(double d10) {
        double attributeDouble = getAttributeDouble("GPSAltitude", -1.0d);
        int attributeInt = getAttributeInt("GPSAltitudeRef", -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d10;
        }
        return attributeDouble * (attributeInt != 1 ? 1 : -1);
    }

    public String getAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            int i10 = dVarE.f89028a;
            if (!f88991d0.contains(str)) {
                return dVarE.getStringValue(this.f89012h);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    j1.o2.u(i10, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                f[] fVarArr = (f[]) dVarE.a(this.f89012h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f89036a / fVar.f89037b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f89036a / fVar2.f89037b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f89036a / fVar3.f89037b)));
            }
            try {
                return Double.toString(dVarE.getDoubleValue(this.f89012h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public byte[] getAttributeBytes(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            return dVarE.f89031d;
        }
        return null;
    }

    public double getAttributeDouble(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            try {
                return dVarE.getDoubleValue(this.f89012h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int getAttributeInt(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            try {
                return dVarE.getIntValue(this.f89012h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public long[] getAttributeRange(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f89024t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            return new long[]{dVarE.f89030c, dVarE.f89031d.length};
        }
        return null;
    }

    public Long getDateTime() {
        return v(getAttribute("DateTime"), getAttribute("SubSecTime"), getAttribute("OffsetTime"));
    }

    public Long getDateTimeDigitized() {
        return v(getAttribute("DateTimeDigitized"), getAttribute("SubSecTimeDigitized"), getAttribute("OffsetTimeDigitized"));
    }

    public Long getDateTimeOriginal() {
        return v(getAttribute("DateTimeOriginal"), getAttribute("SubSecTimeOriginal"), getAttribute("OffsetTimeOriginal"));
    }

    public Long getGpsDateTime() {
        String attribute = getAttribute("GPSDateStamp");
        String attribute2 = getAttribute("GPSTimeStamp");
        if (attribute != null && attribute2 != null) {
            Pattern pattern = f88996i0;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = T.parse(str, parsePosition);
                    if (date == null && (date = U.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] getThumbnail() {
        int i10 = this.f89019o;
        if (i10 == 6 || i10 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.f89013i) {
            return null;
        }
        if (this.f89018n == null) {
            this.f89018n = getThumbnailBytes();
        }
        int i10 = this.f89019o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f89018n, 0, this.f89017m);
        }
        if (i10 != 1) {
            return null;
        }
        int length = this.f89018n.length / 3;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            byte[] bArr = this.f89018n;
            int i12 = i11 * 3;
            iArr[i11] = (bArr[i12] << 16) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
        }
        HashMap[] mapArr = this.f89010f;
        d dVar = (d) mapArr[4].get("ThumbnailImageLength");
        d dVar2 = (d) mapArr[4].get("ThumbnailImageWidth");
        if (dVar == null || dVar2 == null) {
            return null;
        }
        return Bitmap.createBitmap(iArr, dVar2.getIntValue(this.f89012h), dVar.getIntValue(this.f89012h), Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x0087, Exception -> 0x0089, TRY_ENTER, TryCatch #3 {Exception -> 0x0089, blocks: (B:32:0x005a, B:35:0x0070, B:37:0x007c, B:46:0x008b, B:47:0x0090, B:48:0x0091, B:49:0x0096), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091 A[Catch: all -> 0x0087, Exception -> 0x0089, TryCatch #3 {Exception -> 0x0089, blocks: (B:32:0x005a, B:35:0x0070, B:37:0x007c, B:46:0x008b, B:47:0x0090, B:48:0x0091, B:49:0x0096), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getThumbnailBytes() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f89013i
            r2 = 0
            if (r1 != 0) goto L9
            goto Lab
        L9:
            byte[] r1 = r9.f89018n
            if (r1 == 0) goto Le
            return r1
        Le:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f89007c     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            if (r1 == 0) goto L30
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            if (r3 == 0) goto L27
            r1.reset()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
        L1b:
            r3 = r2
            goto L5a
        L1d:
            r0 = move-exception
            r3 = r2
        L1f:
            r2 = r1
            goto Lac
        L22:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L9e
        L27:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            jh.i.w(r1)
            return r2
        L30:
            java.lang.String r1 = r9.f89005a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            if (r1 == 0) goto L45
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            java.lang.String r3 = r9.f89005a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            goto L1b
        L3c:
            r0 = move-exception
            r3 = r2
            goto Lac
        L40:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L9e
        L45:
            java.io.FileDescriptor r1 = r9.f89006b     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            java.io.FileDescriptor r1 = v4.h.b(r1)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L40
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r4 = 0
            v4.h.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9a
            r8 = r3
            r3 = r1
            r1 = r8
        L5a:
            int r4 = r9.f89016l     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r5 = r9.f89020p     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            long r4 = r1.skip(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r9.f89016l     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r7 = r9.f89020p     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L91
            int r4 = r9.f89017m     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r6 = r1.read(r4)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            int r7 = r9.f89017m     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            if (r6 != r7) goto L8b
            r9.f89018n = r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            jh.i.w(r1)
            if (r3 == 0) goto L86
            jh.i.v(r3)
        L86:
            return r4
        L87:
            r0 = move-exception
            goto L1f
        L89:
            r4 = move-exception
            goto L9e
        L8b:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            throw r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
        L91:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            throw r4     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
        L97:
            r0 = move-exception
            r3 = r1
            goto Lac
        L9a:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L9e:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L87
            jh.i.w(r1)
            if (r3 == 0) goto Lab
            jh.i.v(r3)
        Lab:
            return r2
        Lac:
            jh.i.w(r2)
            if (r3 == 0) goto Lb4
            jh.i.v(r3)
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.getThumbnailBytes():byte[]");
    }

    public long[] getThumbnailRange() {
        if (this.f89024t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f89013i) {
            return null;
        }
        if (!this.f89014j || this.f89015k) {
            return new long[]{this.f89016l + this.f89020p, this.f89017m};
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:167|12|158|13|150|14|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|162|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:156|90|154|91|92|(1:94)(1:95)|96|(1:110)(3:112|(2:113|(2:115|(2:169|117)(1:118))(2:168|119))|(1:121)(4:123|(2:124|(2:126|(1:171)(1:129))(3:170|130|(2:131|(1:172)(2:133|(1:173)(1:136)))))|128|(1:138)(1:140)))))|16|162|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f6, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f9, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fb, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fd, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ff, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0103, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0105, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0108, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.h(java.io.BufferedInputStream):int");
    }

    public boolean hasAttribute(String str) {
        return e(str) != null;
    }

    public boolean hasThumbnail() {
        return this.f89013i;
    }

    public final void i(g gVar) throws Throwable {
        int i10;
        int i11;
        l(gVar);
        HashMap[] mapArr = this.f89010f;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f89031d);
            gVar2.setByteOrder(this.f89012h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.seek(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.seek(12L);
            }
            A(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.a(this.f89012h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarCreateUShort = d.createUShort(i14, this.f89012h);
                d dVarCreateUShort2 = d.createUShort(i15, this.f89012h);
                mapArr[0].put("ImageWidth", dVarCreateUShort);
                mapArr[0].put("ImageLength", dVarCreateUShort2);
            }
        }
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt("Orientation", 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.f89013i) {
            return false;
        }
        int i10 = this.f89019o;
        return i10 == 6 || i10 == 7;
    }

    public final void j(b bVar) throws Throwable {
        if (f89000v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.setByteOrder(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.skipFully(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, J)) {
                    return;
                }
                if (Arrays.equals(bArr2, H)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + jh.i.g(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f89020p = i11;
                        z(0, bArr3);
                        J();
                        G(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.skipFully(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        boolean z10 = f89000v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.skipFully(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.skipFully(i10 - bVar.position());
        bVar.read(bArr4);
        g(new b(bArr4), i10, 5);
        bVar.skipFully(i12 - bVar.position());
        bVar.setByteOrder(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            o2.z(i13, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == Y.f89032a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarCreateUShort = d.createUShort(s10, this.f89012h);
                d dVarCreateUShort2 = d.createUShort(s11, this.f89012h);
                HashMap[] mapArr = this.f89010f;
                mapArr[0].put("ImageLength", dVarCreateUShort);
                mapArr[0].put("ImageWidth", dVarCreateUShort2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.skipFully(unsignedShort2);
        }
    }

    public final void l(g gVar) throws Throwable {
        w(gVar);
        A(gVar, 0);
        I(gVar, 0);
        I(gVar, 5);
        I(gVar, 4);
        J();
        if (this.f89008d == 8) {
            HashMap[] mapArr = this.f89010f;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f89031d);
                gVar2.setByteOrder(this.f89012h);
                gVar2.skipFully(6);
                A(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void m(g gVar) throws Throwable {
        if (f89000v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        l(gVar);
        HashMap[] mapArr = this.f89010f;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f89031d), (int) dVar.f89030c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final void n(g gVar) throws IOException {
        byte[] bArr = f88994g0;
        gVar.skipFully(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f89020p = bArr.length;
        z(0, bArr2);
    }

    public final void o(b bVar) throws Throwable {
        if (f89000v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.setByteOrder(ByteOrder.LITTLE_ENDIAN);
        bVar.skipFully(K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.skipFully(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f89020p = i12;
                        z(0, bArr3);
                        G(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + jh.i.g(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.skipFully(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void q(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int intValue = dVar.getIntValue(this.f89012h);
        int intValue2 = dVar2.getIntValue(this.f89012h);
        if (this.f89008d == 7) {
            intValue += this.f89021q;
        }
        if (intValue > 0 && intValue2 > 0) {
            this.f89013i = true;
            if (this.f89005a == null && this.f89007c == null && this.f89006b == null) {
                byte[] bArr = new byte[intValue2];
                bVar.skip(intValue);
                bVar.read(bArr);
                this.f89018n = bArr;
            }
            this.f89016l = intValue;
            this.f89017m = intValue2;
        }
        if (f89000v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + intValue + ", length: " + intValue2);
        }
    }

    public final void r(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f89007c = null;
        this.f89005a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (s(fileInputStream.getFD())) {
                this.f89006b = fileInputStream.getFD();
            } else {
                this.f89006b = null;
            }
            u(fileInputStream);
            jh.i.w(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            jh.i.w(fileInputStream2);
            throw th;
        }
    }

    public void resetOrientation() throws NumberFormatException {
        setAttribute("Orientation", Integer.toString(1));
    }

    public void rotate(int i10) throws NumberFormatException {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt("Orientation", 1);
        Integer numValueOf = Integer.valueOf(attributeInt);
        List list = f89001w;
        if (list.contains(numValueOf)) {
            int iIndexOf = ((i10 / 90) + list.indexOf(Integer.valueOf(attributeInt))) % 4;
            iIntValue = ((Integer) list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0))).intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(attributeInt);
            List list2 = f89002x;
            if (list2.contains(numValueOf2)) {
                int iIndexOf2 = ((i10 / 90) + list2.indexOf(Integer.valueOf(attributeInt))) % 4;
                iIntValue = ((Integer) list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0))).intValue();
            }
        }
        setAttribute("Orientation", Integer.toString(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0105, TryCatch #21 {Exception -> 0x0105, all -> 0x0101, blocks: (B:72:0x00ed, B:74:0x00f1, B:82:0x0110, B:81:0x0108), top: B:125:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108 A[Catch: all -> 0x0101, Exception -> 0x0105, TryCatch #21 {Exception -> 0x0105, all -> 0x0101, blocks: (B:72:0x00ed, B:74:0x00f1, B:82:0x0110, B:81:0x0108), top: B:125:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void saveAttributes() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.saveAttributes():void");
    }

    public void setAltitude(double d10) throws NumberFormatException {
        String str = d10 >= 0.0d ? "0" : "1";
        setAttribute("GPSAltitude", new f(Math.abs(d10)).toString());
        setAttribute("GPSAltitudeRef", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAttribute(java.lang.String r20, java.lang.String r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.setAttribute(java.lang.String, java.lang.String):void");
    }

    public void setDateTime(Long l9) throws NumberFormatException {
        if (l9 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l9.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l9.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = a.b.k("0", string);
        }
        setAttribute("DateTime", T.format(new Date(l9.longValue())));
        setAttribute("SubSecTime", string);
    }

    public void setGpsInfo(Location location) throws NumberFormatException {
        if (location == null) {
            return;
        }
        setAttribute("GPSProcessingMethod", location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute("GPSSpeedRef", "K");
        setAttribute("GPSSpeed", new f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = T.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute("GPSDateStamp", strArrSplit[0]);
        setAttribute("GPSTimeStamp", strArrSplit[1]);
    }

    public void setLatLong(double d10, double d11) throws NumberFormatException {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        setAttribute("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
        setAttribute("GPSLatitude", b(Math.abs(d10)));
        setAttribute("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
        setAttribute("GPSLongitude", b(Math.abs(d11)));
    }

    public final boolean t(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.getIntValue(this.f89012h) <= 512 && dVar2.getIntValue(this.f89012h) <= 512;
    }

    public final void u(InputStream inputStream) {
        boolean z10 = f89000v;
        for (int i10 = 0; i10 < Z.length; i10++) {
            try {
                try {
                    this.f89010f[i10] = new HashMap();
                } finally {
                    a();
                    if (z10) {
                        x();
                    }
                }
            } catch (IOException | UnsupportedOperationException e10) {
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (z10) {
                    x();
                    return;
                }
                return;
            }
        }
        boolean z11 = this.f89009e;
        if (!z11) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f89008d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i11 = this.f89008d;
        if (i11 == 4 || i11 == 9 || i11 == 13 || i11 == 14) {
            b bVar = new b(inputStream);
            int i12 = this.f89008d;
            if (i12 == 4) {
                g(bVar, 0, 0);
            } else if (i12 == 13) {
                j(bVar);
            } else if (i12 == 9) {
                k(bVar);
            } else if (i12 == 14) {
                o(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (z11) {
                n(gVar);
            } else {
                int i13 = this.f89008d;
                if (i13 == 12) {
                    f(gVar);
                } else if (i13 == 7) {
                    i(gVar);
                } else if (i13 == 10) {
                    m(gVar);
                } else {
                    l(gVar);
                }
            }
            gVar.seek(this.f89020p);
            G(gVar);
        }
    }

    public final void w(g gVar) throws IOException {
        ByteOrder byteOrderY = y(gVar);
        this.f89012h = byteOrderY;
        gVar.setByteOrder(byteOrderY);
        int unsignedShort = gVar.readUnsignedShort();
        int i10 = this.f89008d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException(w0.i.b(unsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int i11 = gVar.readInt();
        if (i11 < 8) {
            throw new IOException(a.b.e(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            gVar.skipFully(i12);
        }
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f89010f;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbT = o2.t(i10, "The size of tag group[", "]: ");
            sbT.append(mapArr[i10].size());
            Log.d("ExifInterface", sbT.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.getStringValue(this.f89012h) + "'");
            }
            i10++;
        }
    }

    public final void z(int i10, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        w(gVar);
        A(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(v4.g r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.A(v4.g, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
    
        r24.setByteOrder(r23.f89012h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(v4.b r24, int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.g(v4.b, int, int):void");
    }

    public double[] getLatLong() {
        String attribute = getAttribute("GPSLatitude");
        String attribute2 = getAttribute("GPSLatitudeRef");
        String attribute3 = getAttribute("GPSLongitude");
        String attribute4 = getAttribute("GPSLongitudeRef");
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{c(attribute, attribute2), c(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sbB = b3.h.b("latValue=", attribute, ", latRef=", attribute2, ", lngValue=");
            sbB.append(attribute3);
            sbB.append(", lngRef=");
            sbB.append(attribute4);
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbB.toString()));
            return null;
        }
    }

    public c(String str) throws Throwable {
        e[][] eVarArr = Z;
        this.f89010f = new HashMap[eVarArr.length];
        this.f89011g = new HashSet(eVarArr.length);
        this.f89012h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            r(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public c(FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = Z;
        this.f89010f = new HashMap[eVarArr.length];
        this.f89011g = new HashSet(eVarArr.length);
        this.f89012h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f89007c = null;
            this.f89005a = null;
            if (s(fileDescriptor)) {
                this.f89006b = fileDescriptor;
                try {
                    fileDescriptor = h.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f89006b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    u(fileInputStream);
                    jh.i.w(fileInputStream);
                    if (z10) {
                        jh.i.v(fileDescriptor);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    jh.i.w(fileInputStream);
                    if (z10) {
                        jh.i.v(fileDescriptor);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public c(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.io.InputStream r7, int r8) throws java.io.IOException {
        /*
            r6 = this;
            r6.<init>()
            v4.e[][] r0 = v4.c.Z
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r6.f89010f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r6.f89011g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r6.f89012h = r0
            if (r7 == 0) goto L7e
            r0 = 0
            r6.f89005a = r0
            r1 = 1
            if (r8 != r1) goto L50
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream
            byte[] r2 = v4.c.f88994g0
            int r3 = r2.length
            r8.<init>(r7, r3)
            int r7 = r2.length
            r8.mark(r7)
            int r7 = r2.length
            byte[] r7 = new byte[r7]
            r8.read(r7)
            r8.reset()
            r3 = 0
        L34:
            int r4 = r2.length
            if (r3 >= r4) goto L48
            r4 = r7[r3]
            r5 = r2[r3]
            if (r4 == r5) goto L45
            java.lang.String r7 = "ExifInterface"
            java.lang.String r8 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r7, r8)
            return
        L45:
            int r3 = r3 + 1
            goto L34
        L48:
            r6.f89009e = r1
            r6.f89007c = r0
            r6.f89006b = r0
            r7 = r8
            goto L7a
        L50:
            boolean r8 = r7 instanceof android.content.res.AssetManager.AssetInputStream
            if (r8 == 0) goto L5c
            r8 = r7
            android.content.res.AssetManager$AssetInputStream r8 = (android.content.res.AssetManager.AssetInputStream) r8
            r6.f89007c = r8
            r6.f89006b = r0
            goto L7a
        L5c:
            boolean r8 = r7 instanceof java.io.FileInputStream
            if (r8 == 0) goto L76
            r8 = r7
            java.io.FileInputStream r8 = (java.io.FileInputStream) r8
            java.io.FileDescriptor r1 = r8.getFD()
            boolean r1 = s(r1)
            if (r1 == 0) goto L76
            r6.f89007c = r0
            java.io.FileDescriptor r8 = r8.getFD()
            r6.f89006b = r8
            goto L7a
        L76:
            r6.f89007c = r0
            r6.f89006b = r0
        L7a:
            r6.u(r7)
            return
        L7e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "inputStream cannot be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.<init>(java.io.InputStream, int):void");
    }
}
