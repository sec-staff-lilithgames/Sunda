package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzglm {
    public static String zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zzd(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (zzd(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zzc(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (zzc(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static boolean zzc(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean zzd(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean zze(CharSequence charSequence, CharSequence charSequence2) {
        int iZzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence2.charAt(i10);
            if (cCharAt != cCharAt2 && ((iZzf = zzf(cCharAt)) >= 26 || iZzf != zzf(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int zzf(char c10) {
        return (char) ((c10 | ' ') - 97);
    }
}
