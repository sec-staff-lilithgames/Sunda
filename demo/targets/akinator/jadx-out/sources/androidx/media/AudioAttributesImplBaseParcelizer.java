package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(g6.d dVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6767a = dVar.readInt(audioAttributesImplBase.f6767a, 1);
        audioAttributesImplBase.f6768b = dVar.readInt(audioAttributesImplBase.f6768b, 2);
        audioAttributesImplBase.f6769c = dVar.readInt(audioAttributesImplBase.f6769c, 3);
        audioAttributesImplBase.f6770d = dVar.readInt(audioAttributesImplBase.f6770d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, g6.d dVar) {
        dVar.setSerializationFlags(false, false);
        dVar.writeInt(audioAttributesImplBase.f6767a, 1);
        dVar.writeInt(audioAttributesImplBase.f6768b, 2);
        dVar.writeInt(audioAttributesImplBase.f6769c, 3);
        dVar.writeInt(audioAttributesImplBase.f6770d, 4);
    }
}
