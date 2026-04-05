package ba;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface b {
    void deleteAwardsInDB(a aVar);

    void deleteTenueInDB(n nVar);

    List<a> getAllAwards();

    List<a> getAllAwardsForSpecificBaseLogique(int i10, String str);

    List<a> getCharactersPlayedForAwardLevel(int i10, int i11, String str);

    String getDefiIdSpecificThemeLang(String str);

    m getNbAward();

    int getNbAwardForSpecificBaseLogiqueAndType(String str, int i10, String str2);

    int getNbAwardForSpecificIdAndLevel(String str);

    int getNbAwardForSpecificThemeAndLevel(String str, int i10, String str2);

    int getTrouve0ForSpecificThemeLang(String str);

    int getTrouve1ForSpecificThemeLang(String str);

    int getTrouve2ForSpecificThemeLang(String str);

    int getTrouve3ForSpecificThemeLang(String str);

    int getTrouve4ForSpecificThemeLang(String str);

    o getTrouveInfosForSpecificThemeLang(String str);

    void insertAwardsInDB(a aVar);

    void insertInfosDefis(o oVar);

    void insertNbAwardsInDB(m mVar);

    void insertTenueInDB(n nVar);

    a isAwardAlreadyWonForCharacter(String str, int i10, String str2);
}
