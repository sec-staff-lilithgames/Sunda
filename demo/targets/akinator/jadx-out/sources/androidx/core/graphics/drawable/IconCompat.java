package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.j0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.d0;
import m3.a;
import w3.d;
import w3.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f5749k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f5750a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5751b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5752c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f5753d;

    /* renamed from: e, reason: collision with root package name */
    public int f5754e;

    /* renamed from: f, reason: collision with root package name */
    public int f5755f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f5756g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5757h;

    /* renamed from: i, reason: collision with root package name */
    public String f5758i;

    /* renamed from: j, reason: collision with root package name */
    public String f5759j;

    public IconCompat() {
        this.f5750a = -1;
        this.f5752c = null;
        this.f5753d = null;
        this.f5754e = 0;
        this.f5755f = 0;
        this.f5756g = null;
        this.f5757h = f5749k;
        this.f5758i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static Resources b(Context context, String str) throws PackageManager.NameNotFoundException {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, Segment.SIZE);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", "Unable to find pkg=" + str + " for icon", e10);
            return null;
        }
    }

    public static IconCompat createFromBundle(Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f5754e = bundle.getInt("int1");
        iconCompat.f5755f = bundle.getInt("int2");
        iconCompat.f5759j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f5756g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f5757h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f5751b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                o2.u(i10, "Unknown type ", "IconCompat");
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f5751b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f5751b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat createFromIcon(Context context, Icon icon) {
        i.checkNotNull(icon);
        int iQ = d0.q(icon);
        if (iQ == 2) {
            String strO = d0.o(icon);
            try {
                return createWithResource(b(context, strO), strO, d0.n(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (iQ == 4) {
            return createWithContentUri(d0.r(icon));
        }
        if (iQ == 6) {
            return createWithAdaptiveBitmapContentUri(d0.r(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f5751b = icon;
        return iconCompat;
    }

    public static IconCompat createFromIconOrNullIfZeroResId(Icon icon) {
        if (d0.q(icon) == 2 && d0.n(icon) == 0) {
            return null;
        }
        return d0.j(icon);
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        d.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f5751b = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(String str) {
        d.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f5751b = str;
        return iconCompat;
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        d.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f5751b = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(String str) {
        d.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f5751b = str;
        return iconCompat;
    }

    public static IconCompat createWithData(byte[] bArr, int i10, int i11) {
        d.requireNonNull(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f5751b = bArr;
        iconCompat.f5754e = i10;
        iconCompat.f5755f = i11;
        return iconCompat;
    }

    public static IconCompat createWithResource(Context context, int i10) {
        d.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i10);
    }

    public void addToShortcutIntent(Intent intent, Drawable drawable, Context context) throws PackageManager.NameNotFoundException {
        Bitmap bitmapCopy;
        checkResource(context);
        int i10 = this.f5750a;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f5751b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f5754e));
                    return;
                }
                Drawable drawable2 = a.getDrawable(contextCreatePackageContext, this.f5754e);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f5751b, e10);
            }
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = a((Bitmap) this.f5751b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    public void checkResource(Context context) {
        Object obj;
        if (this.f5750a != 2 || (obj = this.f5751b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String resPackage = getResPackage();
            int identifier = b(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.f5754e != identifier) {
                Log.i("IconCompat", "Id has changed for " + resPackage + " " + str);
                this.f5754e = identifier;
            }
        }
    }

    public Bitmap getBitmap() {
        int i10 = this.f5750a;
        if (i10 == -1) {
            Object obj = this.f5751b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f5751b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f5751b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int getResId() {
        int i10 = this.f5750a;
        if (i10 == -1) {
            return d0.n(this.f5751b);
        }
        if (i10 == 2) {
            return this.f5754e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String getResPackage() {
        int i10 = this.f5750a;
        if (i10 == -1) {
            return d0.o(this.f5751b);
        }
        if (i10 == 2) {
            String str = this.f5759j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5751b).split(":", -1)[0] : this.f5759j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        int i10 = this.f5750a;
        return i10 == -1 ? d0.q(this.f5751b) : i10;
    }

    public Uri getUri() {
        int i10 = this.f5750a;
        if (i10 == -1) {
            return d0.r(this.f5751b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f5751b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream getUriInputStream(Context context) {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) || C3191e4.h.f36473b.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uri, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f5751b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uri, e11);
            return null;
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        return toIcon(context).loadDrawable(context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.f5757h = PorterDuff.Mode.valueOf(this.f5758i);
        switch (this.f5750a) {
            case -1:
                Parcelable parcelable = this.f5753d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f5751b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f5753d;
                if (parcelable2 != null) {
                    this.f5751b = parcelable2;
                    return;
                }
                byte[] bArr = this.f5752c;
                this.f5751b = bArr;
                this.f5750a = 3;
                this.f5754e = 0;
                this.f5755f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f5752c, Charset.forName(C.UTF16_NAME));
                this.f5751b = str;
                if (this.f5750a == 2 && this.f5759j == null) {
                    this.f5759j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f5751b = this.f5752c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z10) {
        this.f5758i = this.f5757h.name();
        switch (this.f5750a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f5753d = (Parcelable) this.f5751b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f5753d = (Parcelable) this.f5751b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f5751b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f5752c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f5752c = ((String) this.f5751b).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f5752c = (byte[]) this.f5751b;
                return;
            case 4:
            case 6:
                this.f5752c = this.f5751b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
    }

    public IconCompat setTint(int i10) {
        return setTintList(ColorStateList.valueOf(i10));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.f5756g = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.f5757h = mode;
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.f5750a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f5751b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f5751b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f5751b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f5751b);
                break;
        }
        bundle.putInt("type", this.f5750a);
        bundle.putInt("int1", this.f5754e);
        bundle.putInt("int2", this.f5755f);
        bundle.putString("string1", this.f5759j);
        ColorStateList colorStateList = this.f5756g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f5757h;
        if (mode != f5749k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    public String toString() {
        String str;
        if (this.f5750a == -1) {
            return String.valueOf(this.f5751b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f5750a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f5750a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f5751b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f5751b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f5759j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f5754e);
                if (this.f5755f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f5755f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f5751b);
                break;
        }
        if (this.f5756g != null) {
            sb2.append(" tint=");
            sb2.append(this.f5756g);
        }
        if (this.f5757h != f5749k) {
            sb2.append(" mode=");
            sb2.append(this.f5757h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public Icon toIcon(Context context) {
        Icon iconCreateWithBitmap;
        int i10 = Build.VERSION.SDK_INT;
        switch (this.f5750a) {
            case -1:
                return (Icon) this.f5751b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f5751b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(getResPackage(), this.f5754e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f5751b, this.f5754e, this.f5755f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f5751b);
                break;
            case 5:
                if (i10 < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f5751b, false));
                    break;
                } else {
                    iconCreateWithBitmap = j0.n((Bitmap) this.f5751b);
                    break;
                }
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = c4.a.d(getUri());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + getUri());
                    }
                    InputStream uriInputStream = getUriInputStream(context);
                    if (uriInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + getUri());
                    }
                    if (i10 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(uriInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = j0.n(BitmapFactory.decodeStream(uriInputStream));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f5756g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f5757h;
        if (mode != f5749k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static IconCompat createWithResource(Resources resources, String str, int i10) {
        d.requireNonNull(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f5754e = i10;
            if (resources != null) {
                try {
                    iconCompat.f5751b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f5751b = str;
            }
            iconCompat.f5759j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(Uri uri) {
        d.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public static IconCompat createWithContentUri(Uri uri) {
        d.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public IconCompat(int i10) {
        this.f5752c = null;
        this.f5753d = null;
        this.f5754e = 0;
        this.f5755f = 0;
        this.f5756g = null;
        this.f5757h = f5749k;
        this.f5758i = null;
        this.f5750a = i10;
    }

    public static IconCompat createFromIcon(Icon icon) {
        return d0.j(icon);
    }
}
