package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class k {
    @DungeonFlag
    public static List<e> a(File file) throws Throwable {
        CertificateFactory certificateFactory;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream = null;
        try {
            certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        } catch (CertificateException unused) {
            certificateFactory = null;
        }
        if (certificateFactory == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    ZipInputStream zipInputStream2 = new ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream2.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (name.startsWith("META-INF/")) {
                                    if (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC")) {
                                        try {
                                            for (Certificate certificate : certificateFactory.generateCertificates(new ByteArrayInputStream(a(zipInputStream2)))) {
                                                if (certificate instanceof X509Certificate) {
                                                    arrayList.add(new e(String.valueOf(((X509Certificate) certificate).getSubjectDN()), certificate.getEncoded()));
                                                }
                                            }
                                        } catch (CertificateException unused2) {
                                        }
                                    } else {
                                        zipInputStream2.closeEntry();
                                    }
                                }
                            } else {
                                try {
                                    break;
                                } catch (IOException unused3) {
                                }
                            }
                        } catch (IOException unused4) {
                            zipInputStream = zipInputStream2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return arrayList;
                        } catch (Throwable th2) {
                            zipInputStream = zipInputStream2;
                            th = th2;
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (IOException unused7) {
                                throw th;
                            }
                        }
                    }
                    zipInputStream2.close();
                    fileInputStream.close();
                } catch (IOException unused8) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused9) {
            }
        } catch (IOException unused10) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return arrayList;
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
