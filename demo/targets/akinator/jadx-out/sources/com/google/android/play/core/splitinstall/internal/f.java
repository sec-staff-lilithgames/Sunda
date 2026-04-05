package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public XmlResourceParser f29607a;

    public f(ih.b bVar) {
    }

    public final long zza() throws XmlPullParserException, IOException, NumberFormatException {
        if (this.f29607a == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.f29607a.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.f29607a.getName().equals("manifest")) {
                String attributeValue = this.f29607a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f29607a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i10 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i10;
                    }
                    try {
                        return (Integer.parseInt(attributeValue2) << 32) | (i10 & 4294967295L);
                    } catch (NumberFormatException e10) {
                        throw new XmlPullParserException(a.b.k("Couldn't parse versionCodeMajor to int: ", e10.getMessage()));
                    }
                } catch (NumberFormatException e11) {
                    throw new XmlPullParserException(a.b.k("Couldn't parse versionCode to int: ", e11.getMessage()));
                }
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void zzb(AssetManager assetManager, File file) throws IOException {
        this.f29607a = assetManager.openXmlResourceParser(ih.b.zzc(assetManager, file), "AndroidManifest.xml");
    }
}
