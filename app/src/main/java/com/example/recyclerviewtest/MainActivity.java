package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Country> countries = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        RecyclerView rv = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        CountryAdapter ca = new CountryAdapter(this,countries);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(ca);

    }
    // prepare data here, and return Country list
    public void init(){
        String[] countryName = new String[]{  // total 195 countries
                "Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina",
                "Armenia","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh",
                "Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia",
                "Bosnia and Herzegovina","Botswana","Brazil","Brunei","Bulgaria","Burkina Faso",
                "Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Central African Republic",
                "Chad","Chile","China","Colombia","Comoros","Congo","Costa Rica","Côte d'Ivoire",
                "Croatia","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica",
                "Dominican Republic","DR Congo","Ecuador","Egypt","El Salvador","Equatorial Guinea",
                "Eritrea","Estonia","Eswatini","Ethiopia","Fiji","Finland","France","Gabon","Gambia",
                "Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau",
                "Guyana","Haiti","Holy See","Honduras","Hungary","Iceland","India","Indonesia","Iran",
                "Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya",
                "Kiribati","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya",
                "Liechtenstein","Lithuania","Luxembourg","Madagascar","Malawi","Malaysia","Maldives",
                "Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia",
                "Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Myanmar","Namibia",
                "Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria",
                "North Korea","North Macedonia","Norway","Oman","Pakistan","Palau","Panama","" +
                "Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar",
                "Romania","Russia","Rwanda","Saint Kitts & Nevis","Saint Lucia","Samoa","San Marino",
                "Sao Tome & Principe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone",
                "Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa",
                "South Korea","South Sudan","Spain","Sri Lanka","St. Vincent & Grenadines",
                "State of Palestine","Sudan","Suriname","Sweden","Switzerland","Syria","Tajikistan",
                "Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia",
                "Turkey","Turkmenistan","Tuvalu","Uganda","Ukraine","United Arab Emirates",
                "United Kingdom","United States","Uruguay","Uzbekistan","Vanuatu","Venezuela",
                "Vietnam","Yemen","Zambia","Zimbabwe"};
        String[] capitals = new String[] { // capitals of countries
                "KABUL","TIRANA","ALGIERS","ANDORRA LA VELLA","LUANDA","SAINT JOHN'S","BUENOS AIRES",
                "YEREVAN","CANBERRA","VIENNA","BAKU","NASSAU","MANAMA","DHAKA","BRIDGETOWN","MINSK",
                "BRUSSELS","BELMOPAN","PORTO-NOVO","THIMPHU","SUCRE","SARAJEVO","GABORONE","BRASILIA",
                "BANDAR SERI BEGAWAN","SOFIA","OUAGADOUGOU","BUJUMBURA","PRAIA","PHNOM PENH","YAOUNDE",
                "OTTAWA","BANGUI","N'DJAMENA","SANTIAGO","BEIJING","BOGOTÁ","MORONI","KINSHASA",
                "SAN JOSE","YAMOUSSOUKRO","ZAGREB","HAVANA","NICOSIA","PRAGUE","COPENHAGEN",
                "DJIBOUTI (CITY)","ROSEAU","SANTO DOMINGO","BRAZZAVILLE","QUITO","CAIRO",
                "SAN SALVADOR","MALABO","ASMARA","TALLINN","MBABANE","ADDIS ABABA","SUVA",
                "HELSINKI","PARIS","LIBREVILLE","BANJUL","TBILISI","BERLIN","ACCRA","ATHENS",
                "SAINT GEORGE'S","GUATEMALA CITY","CONAKRY","BISSAU","GEORGETOWN","PORT-AU-PRINCE",
                "VATICAN CITY","TEGUCIGALPA","BUDAPEST","REYKJAVIK","NEW DELHI","JAKARTA","TEHRAN",
                "BAGHDAD","DUBLIN","JERUSALEM","ROME","KINGSTON","TOKYO","AMMAN","NUR-SULTAN","NAIROBI",
                "SOUTH TARAWA","KUWAIT CITY","BISHKEK","VIENTIANE","RIGA","BEIRUT","MASERU","MONROVIA",
                "TRIPOLI","VADUZ","VILNIUS","LUXEMBOURG","ANTANANARIVO","LILONGWE","KUALA LUMPUR",
                "MALE","BAMAKO","VALLETTA","MAJURO","NOUAKCHOTT","PORT LOUIS","MEXICO CITY","PALIKIR",
                "CHISINAU","MONACO","ULAANBAATAR","PODGORICA","RABAT","MAPUTO","NAY PYI TAW","WINDHOEK",
                "YAREN DISTRICT","KATHMANDU","AMSTERDAM","WELLINGTON","MANAGUA","NIAMEY","ABUJA",
                "PYONGYANG","SKOPJE","OSLO","MUSCAT","ISLAMABAD","NGERULMUD","PANAMA CITY","PORT MORESBY",
                "ASUNCIÓN","LIMA","MANILA","WARSAW","LISBON","DOHA","BUCHAREST","MOSCOW","KIGALI",
                "BASSETERRE","CASTRIES","APIA","SAN MARINO","SÃO TOMÉ","RIYADH","DAKAR","BELGRADE",
                "VICTORIA","FREETOWN","SINGAPORE","BRATISLAVA","LJUBLJANA","HONIARA","MOGADISHU",
                "BLOEMFONTEIN, CAPE TOWN, PRETORIA","SEOUL","JUBA","MADRID","SRI JAYAWARDENEPURA KOTTE",
                "KINGSTOWN","EAST JERUSALEM","KHARTOUM","PARAMARIBO","STOCKHOLM","BERN","DAMASCUS",
                "DUSHANBE","DODOMA","BANGKOK","DILI","LOMÉ","NUKUʻALOFA","PORT OF SPAIN","TUNIS",
                "ANKARA","ASHGABAT","FUNAFUTI","KAMPALA","KIEV","ABU DHABI","LONDON","WASHINGTON, D.C.",
                "MONTEVIDEO","TASHKENT","PORT VILA","CARACAS","HANOI","SANA'A","LUSAKA","HARARE"
        };
        String[] flagsLink = new String[]{  // website for country flags
                "https://www.worldometers.info/img/flags/af-flag.gif",
                "https://www.worldometers.info/img/flags/al-flag.gif",
                "https://www.worldometers.info/img/flags/ag-flag.gif",
                "https://www.worldometers.info/img/flags/an-flag.gif",
                "https://www.worldometers.info/img/flags/ao-flag.gif",
                "https://www.worldometers.info/img/flags/ac-flag.gif",
                "https://www.worldometers.info/img/flags/ar-flag.gif",
                "https://www.worldometers.info/img/flags/am-flag.gif",
                "https://www.worldometers.info/img/flags/as-flag.gif",
                "https://www.worldometers.info/img/flags/au-flag.gif",
                "https://www.worldometers.info/img/flags/aj-flag.gif",
                "https://www.worldometers.info/img/flags/bf-flag.gif",
                "https://www.worldometers.info/img/flags/ba-flag.gif",
                "https://www.worldometers.info/img/flags/bg-flag.gif",
                "https://www.worldometers.info/img/flags/bb-flag.gif",
                "https://www.worldometers.info/img/flags/bo-flag.gif",
                "https://www.worldometers.info/img/flags/be-flag.gif",
                "https://www.worldometers.info/img/flags/bh-flag.gif",
                "https://www.worldometers.info/img/flags/bn-flag.gif",
                "https://www.worldometers.info/img/flags/bt-flag.gif",
                "https://www.worldometers.info/img/flags/bl-flag.gif",
                "https://www.worldometers.info/img/flags/bk-flag.gif",
                "https://www.worldometers.info/img/flags/bc-flag.gif",
                "https://www.worldometers.info/img/flags/br-flag.gif",
                "https://www.worldometers.info/img/flags/bx-flag.gif",
                "https://www.worldometers.info/img/flags/bu-flag.gif",
                "https://www.worldometers.info/img/flags/uv-flag.gif",
                "https://www.worldometers.info/img/flags/by-flag.gif",
                "https://www.worldometers.info/img/flags/cv-flag.gif",
                "https://www.worldometers.info/img/flags/cb-flag.gif",
                "https://www.worldometers.info/img/flags/cm-flag.gif",
                "https://www.worldometers.info/img/flags/ca-flag.gif",
                "https://www.worldometers.info/img/flags/ct-flag.gif",
                "https://www.worldometers.info/img/flags/cd-flag.gif",
                "https://www.worldometers.info/img/flags/ci-flag.gif",
                "https://www.worldometers.info/img/flags/ch-flag.gif",
                "https://www.worldometers.info/img/flags/co-flag.gif",
                "https://www.worldometers.info/img/flags/cn-flag.gif",
                "https://www.worldometers.info/img/flags/cg-flag.gif",
                "https://www.worldometers.info/img/flags/cs-flag.gif",
                "https://www.worldometers.info/img/flags/iv-flag.gif",
                "https://www.worldometers.info/img/flags/hr-flag.gif",
                "https://www.worldometers.info/img/flags/cu-flag.gif",
                "https://www.worldometers.info/img/flags/cy-flag.gif",
                "https://www.worldometers.info/img/flags/ez-flag.gif",
                "https://www.worldometers.info/img/flags/da-flag.gif",
                "https://www.worldometers.info/img/flags/dj-flag.gif",
                "https://www.worldometers.info/img/flags/do-flag.gif",
                "https://www.worldometers.info/img/flags/dr-flag.gif",
                "https://www.worldometers.info/img/flags/congo-flag.gif",
                "https://www.worldometers.info/img/flags/ec-flag.gif",
                "https://www.worldometers.info/img/flags/eg-flag.gif",
                "https://www.worldometers.info/img/flags/es-flag.gif",
                "https://www.worldometers.info/img/flags/ek-flag.gif",
                "https://www.worldometers.info/img/flags/er-flag.gif",
                "https://www.worldometers.info/img/flags/en-flag.gif",
                "https://www.worldometers.info/img/flags/wz-flag.gif",
                "https://www.worldometers.info/img/flags/et-flag.gif",
                "https://www.worldometers.info/img/flags/fj-flag.gif",
                "https://www.worldometers.info/img/flags/fi-flag.gif",
                "https://www.worldometers.info/img/flags/fr-flag.gif",
                "https://www.worldometers.info/img/flags/gb-flag.gif",
                "https://www.worldometers.info/img/flags/ga-flag.gif",
                "https://www.worldometers.info/img/flags/gg-flag.gif",
                "https://www.worldometers.info/img/flags/gm-flag.gif",
                "https://www.worldometers.info/img/flags/gh-flag.gif",
                "https://www.worldometers.info/img/flags/gr-flag.gif",
                "https://www.worldometers.info/img/flags/gj-flag.gif",
                "https://www.worldometers.info/img/flags/gt-flag.gif",
                "https://www.worldometers.info/img/flags/gv-flag.gif",
                "https://www.worldometers.info/img/flags/pu-flag.gif",
                "https://www.worldometers.info/img/flags/gy-flag.gif",
                "https://www.worldometers.info/img/flags/ha-flag.gif",
                "https://www.worldometers.info/img/flags/vt-flag.gif",
                "https://www.worldometers.info/img/flags/ho-flag.gif",
                "https://www.worldometers.info/img/flags/hu-flag.gif",
                "https://www.worldometers.info/img/flags/ic-flag.gif",
                "https://www.worldometers.info/img/flags/in-flag.gif",
                "https://www.worldometers.info/img/flags/id-flag.gif",
                "https://www.worldometers.info/img/flags/ir-flag.gif",
                "https://www.worldometers.info/img/flags/iz-flag.gif",
                "https://www.worldometers.info/img/flags/ei-flag.gif",
                "https://www.worldometers.info/img/flags/is-flag.gif",
                "https://www.worldometers.info/img/flags/it-flag.gif",
                "https://www.worldometers.info/img/flags/jm-flag.gif",
                "https://www.worldometers.info/img/flags/ja-flag.gif",
                "https://www.worldometers.info/img/flags/jo-flag.gif",
                "https://www.worldometers.info/img/flags/kz-flag.gif",
                "https://www.worldometers.info/img/flags/ke-flag.gif",
                "https://www.worldometers.info/img/flags/kr-flag.gif",
                "https://www.worldometers.info/img/flags/ku-flag.gif",
                "https://www.worldometers.info/img/flags/kg-flag.gif",
                "https://www.worldometers.info/img/flags/la-flag.gif",
                "https://www.worldometers.info/img/flags/lg-flag.gif",
                "https://www.worldometers.info/img/flags/le-flag.gif",
                "https://www.worldometers.info/img/flags/lt-flag.gif",
                "https://www.worldometers.info/img/flags/li-flag.gif",
                "https://www.worldometers.info/img/flags/ly-flag.gif",
                "https://www.worldometers.info/img/flags/ls-flag.gif",
                "https://www.worldometers.info/img/flags/lh-flag.gif",
                "https://www.worldometers.info/img/flags/lu-flag.gif",
                "https://www.worldometers.info/img/flags/ma-flag.gif",
                "https://www.worldometers.info/img/flags/mi-flag.gif",
                "https://www.worldometers.info/img/flags/my-flag.gif",
                "https://www.worldometers.info/img/flags/mv-flag.gif",
                "https://www.worldometers.info/img/flags/ml-flag.gif",
                "https://www.worldometers.info/img/flags/mt-flag.gif",
                "https://www.worldometers.info/img/flags/rm-flag.gif",
                "https://www.worldometers.info/img/flags/mr-flag.gif",
                "https://www.worldometers.info/img/flags/mp-flag.gif",
                "https://www.worldometers.info/img/flags/mx-flag.gif",
                "https://www.worldometers.info/img/flags/fm-flag.gif",
                "https://www.worldometers.info/img/flags/md-flag.gif",
                "https://www.worldometers.info/img/flags/mn-flag.gif",
                "https://www.worldometers.info/img/flags/mg-flag.gif",
                "https://www.worldometers.info/img/flags/mj-flag.gif",
                "https://www.worldometers.info/img/flags/mo-flag.gif",
                "https://www.worldometers.info/img/flags/mz-flag.gif",
                "https://www.worldometers.info/img/flags/bm-flag.gif",
                "https://www.worldometers.info/img/flags/wa-flag.gif",
                "https://www.worldometers.info/img/flags/nr-flag.gif",
                "https://www.worldometers.info/img/flags/np-flag.gif",
                "https://www.worldometers.info/img/flags/nl-flag.gif",
                "https://www.worldometers.info/img/flags/nz-flag.gif",
                "https://www.worldometers.info/img/flags/nu-flag.gif",
                "https://www.worldometers.info/img/flags/ng-flag.gif",
                "https://www.worldometers.info/img/flags/ni-flag.gif",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Flag_of_North_Korea.svg/800px-Flag_of_North_Korea.svg.png",
                "https://www.worldometers.info/img/flags/mk-flag.gif",
                "https://www.worldometers.info/img/flags/no-flag.gif",
                "https://www.worldometers.info/img/flags/mu-flag.gif",
                "https://www.worldometers.info/img/flags/pk-flag.gif",
                "https://www.worldometers.info/img/flags/ps-flag.gif",
                "https://www.worldometers.info/img/flags/pm-flag.gif",
                "https://www.worldometers.info/img/flags/pp-flag.gif",
                "https://www.worldometers.info/img/flags/pa-flag.gif",
                "https://www.worldometers.info/img/flags/pe-flag.gif",
                "https://www.worldometers.info/img/flags/rp-flag.gif",
                "https://www.worldometers.info/img/flags/pl-flag.gif",
                "https://www.worldometers.info/img/flags/po-flag.gif",
                "https://www.worldometers.info/img/flags/qa-flag.gif",
                "https://www.worldometers.info/img/flags/ro-flag.gif",
                "https://www.worldometers.info/img/flags/rs-flag.gif",
                "https://www.worldometers.info/img/flags/rw-flag.gif",
                "https://www.worldometers.info/img/flags/sc-flag.gif",
                "https://www.worldometers.info/img/flags/st-flag.gif",
                "https://www.worldometers.info/img/flags/ws-flag.gif",
                "https://www.worldometers.info/img/flags/sm-flag.gif",
                "https://www.worldometers.info/img/flags/tp-flag.gif",
                "https://www.worldometers.info/img/flags/sa-flag.gif",
                "https://www.worldometers.info/img/flags/sg-flag.gif",
                "https://www.worldometers.info/img/flags/ri-flag.gif",
                "https://www.worldometers.info/img/flags/se-flag.gif",
                "https://www.worldometers.info/img/flags/sl-flag.gif",
                "https://www.worldometers.info/img/flags/sn-flag.gif",
                "https://www.worldometers.info/img/flags/lo-flag.gif",
                "https://www.worldometers.info/img/flags/si-flag.gif",
                "https://www.worldometers.info/img/flags/bp-flag.gif",
                "https://www.worldometers.info/img/flags/so-flag.gif",
                "https://www.worldometers.info/img/flags/sf-flag.gif",
                "https://www.worldometers.info/img/flags/ks-flag.gif",
                "https://www.worldometers.info/img/flags/od-flag.gif",
                "https://www.worldometers.info/img/flags/sp-flag.gif",
                "https://www.worldometers.info/img/flags/ce-flag.gif",
                "https://www.worldometers.info/img/flags/vc-flag.gif",
                "https://www.worldometers.info/img/flags/palestine-flag.gif",
                "https://www.worldometers.info/img/flags/su-flag.gif",
                "https://www.worldometers.info/img/flags/ns-flag.gif",
                "https://www.worldometers.info/img/flags/sw-flag.gif",
                "https://www.worldometers.info/img/flags/sz-flag.gif",
                "https://www.worldometers.info/img/flags/sy-flag.gif",
                "https://www.worldometers.info/img/flags/ti-flag.gif",
                "https://www.worldometers.info/img/flags/tz-flag.gif",
                "https://www.worldometers.info/img/flags/th-flag.gif",
                "https://www.worldometers.info/img/flags/tt-flag.gif",
                "https://www.worldometers.info/img/flags/to-flag.gif",
                "https://www.worldometers.info/img/flags/tn-flag.gif",
                "https://www.worldometers.info/img/flags/td-flag.gif",
                "https://www.worldometers.info/img/flags/ts-flag.gif",
                "https://www.worldometers.info/img/flags/tu-flag.gif",
                "https://www.worldometers.info/img/flags/tx-flag.gif",
                "https://www.worldometers.info/img/flags/tv-flag.gif",
                "https://www.worldometers.info/img/flags/ug-flag.gif",
                "https://www.worldometers.info/img/flags/up-flag.gif",
                "https://www.worldometers.info/img/flags/ae-flag.gif",
                "https://www.worldometers.info/img/flags/uk-flag.gif",
                "https://www.worldometers.info/img/flags/us-flag.gif",
                "https://www.worldometers.info/img/flags/uy-flag.gif",
                "https://www.worldometers.info/img/flags/uz-flag.gif",
                "https://www.worldometers.info/img/flags/nh-flag.gif",
                "https://www.worldometers.info/img/flags/ve-flag.gif",
                "https://www.worldometers.info/img/flags/vm-flag.gif",
                "https://www.worldometers.info/img/flags/ym-flag.gif",
                "https://www.worldometers.info/img/flags/za-flag.gif",
                "https://www.worldometers.info/img/flags/zi-flag.gif" };

        String[] website = new String[]{
                "https://www.nationsonline.org/oneworld/afghanistan.htm",
                "https://www.nationsonline.org/oneworld/albania.htm",
                "https://www.nationsonline.org/oneworld/algeria.htm",
                "https://www.nationsonline.org/oneworld/andorra.htm",
                "https://www.nationsonline.org/oneworld/angola.htm",
                "https://www.nationsonline.org/oneworld/antigua_barbuda.htm",
                "https://www.nationsonline.org/oneworld/argentina.htm",
                "https://www.nationsonline.org/oneworld/armenia.htm",
                "https://www.nationsonline.org/oneworld/australia.htm",
                "https://www.nationsonline.org/oneworld/austria.htm",
                "https://www.nationsonline.org/oneworld/azerbaijan.htm",
                "https://www.nationsonline.org/oneworld/bahamas.htm",
                "https://www.nationsonline.org/oneworld/bahrain.htm",
                "https://www.nationsonline.org/oneworld/bangladesh.htm",
                "https://www.nationsonline.org/oneworld/barbados.htm",
                "https://www.nationsonline.org/oneworld/belarus.htm",
                "https://www.nationsonline.org/oneworld/belgium.htm",
                "https://www.nationsonline.org/oneworld/belize.htm",
                "https://www.nationsonline.org/oneworld/benin.htm",
                "https://www.nationsonline.org/oneworld/bhutan.htm",
                "https://www.nationsonline.org/oneworld/bolivia.htm",
                "https://www.nationsonline.org/oneworld/bosnia_herzegovina.htm",
                "https://www.nationsonline.org/oneworld/botswana.htm",
                "https://www.nationsonline.org/oneworld/brazil.htm",
                "https://www.nationsonline.org/oneworld/brunei.htm",
                "https://www.nationsonline.org/oneworld/bulgaria.htm",
                "https://www.nationsonline.org/oneworld/burkina_faso.htm",
                "https://www.nationsonline.org/oneworld/burundi.htm",
                "https://www.nationsonline.org/oneworld/cape_verde.htm",
                "https://www.nationsonline.org/oneworld/cambodia.htm",
                "https://www.nationsonline.org/oneworld/cameroon.htm",
                "https://www.nationsonline.org/oneworld/canada.htm",
                "https://www.nationsonline.org/oneworld/central_african_republic.htm",
                "https://www.nationsonline.org/oneworld/chad.htm",
                "https://www.nationsonline.org/oneworld/chile.htm",
                "https://www.nationsonline.org/oneworld/china.htm",
                "https://www.nationsonline.org/oneworld/colombia.htm",
                "https://www.nationsonline.org/oneworld/comoros.htm",
                "https://www.nationsonline.org/oneworld/congo_roc.htm",
                "https://www.nationsonline.org/oneworld/costa_rica.htm",
                "https://www.nationsonline.org/oneworld/cote_d_ivoire.htm",
                "https://www.nationsonline.org/oneworld/croatia.htm",
                "https://www.nationsonline.org/oneworld/cuba.htm",
                "https://www.nationsonline.org/oneworld/cyprus.htm",
                "https://www.nationsonline.org/oneworld/czech_republic.htm",
                "https://www.nationsonline.org/oneworld/denmark.htm",
                "https://www.nationsonline.org/oneworld/djibouti.htm",
                "https://www.nationsonline.org/oneworld/dominica.htm",
                "https://www.nationsonline.org/oneworld/dominican_republic.htm",
                "https://www.nationsonline.org/oneworld/congo_droc.htm",
                "https://www.nationsonline.org/oneworld/ecuador.htm",
                "https://www.nationsonline.org/oneworld/egypt.htm",
                "https://www.nationsonline.org/oneworld/el_salvador.htm",
                "https://www.nationsonline.org/oneworld/equatorial_guinea.htm",
                "https://www.nationsonline.org/oneworld/eritrea.htm",
                "https://www.nationsonline.org/oneworld/estonia.htm",
                "https://www.nationsonline.org/oneworld/ethiopia.htm",
                "https://www.nationsonline.org/oneworld/faroe_islands.htm",
                "https://www.nationsonline.org/oneworld/fiji.htm",
                "https://www.nationsonline.org/oneworld/finland.htm",
                "https://www.nationsonline.org/oneworld/france.htm",
                "https://www.nationsonline.org/oneworld/gabon.htm",
                "https://www.nationsonline.org/oneworld/gambia.htm",
                "https://www.nationsonline.org/oneworld/georgia.htm",
                "https://www.nationsonline.org/oneworld/germany.htm",
                "https://www.nationsonline.org/oneworld/ghana.htm",
                "https://www.nationsonline.org/oneworld/greece.htm",
                "https://www.nationsonline.org/oneworld/grenada.htm",
                "https://www.nationsonline.org/oneworld/guatemala.htm",
                "https://www.nationsonline.org/oneworld/guinea.htm",
                "https://www.nationsonline.org/oneworld/guinea_bissau.htm",
                "https://www.nationsonline.org/oneworld/guyana.htm",
                "https://www.nationsonline.org/oneworld/haiti.htm",
                "https://www.nationsonline.org/oneworld/vatican.htm",
                "https://www.nationsonline.org/oneworld/honduras.htm",
                "https://www.nationsonline.org/oneworld/hungary.htm",
                "https://www.nationsonline.org/oneworld/iceland.htm",
                "https://www.nationsonline.org/oneworld/india.htm",
                "https://www.nationsonline.org/oneworld/indonesia.htm",
                "https://www.nationsonline.org/oneworld/iran.htm",
                "https://www.nationsonline.org/oneworld/iraq.htm",
                "https://www.nationsonline.org/oneworld/ireland.htm",
                "https://www.nationsonline.org/oneworld/israel.htm",
                "https://www.nationsonline.org/oneworld/italy.htm",
                "https://www.nationsonline.org/oneworld/jamaica.htm",
                "https://www.nationsonline.org/oneworld/japan.htm",
                "https://www.nationsonline.org/oneworld/jordan.htm",
                "https://www.nationsonline.org/oneworld/kazakhstan.htm",
                "https://www.nationsonline.org/oneworld/kenya.htm",
                "https://www.nationsonline.org/oneworld/kiribati.htm",
                "https://www.nationsonline.org/oneworld/kuwait.htm",
                "https://www.nationsonline.org/oneworld/kyrgyzstan.htm",
                "https://www.nationsonline.org/oneworld/laos.htm",
                "https://www.nationsonline.org/oneworld/latvia.htm",
                "https://www.nationsonline.org/oneworld/lebanon.htm",
                "https://www.nationsonline.org/oneworld/lesotho.htm",
                "https://www.nationsonline.org/oneworld/liberia.htm",
                "https://www.nationsonline.org/oneworld/libya.htm",
                "https://www.nationsonline.org/oneworld/liechtenstein.htm",
                "https://www.nationsonline.org/oneworld/lithuania.htm",
                "https://www.nationsonline.org/oneworld/luxembourg.htm",
                "https://www.nationsonline.org/oneworld/madagascar.htm",
                "https://www.nationsonline.org/oneworld/malawi.htm",
                "https://www.nationsonline.org/oneworld/malaysia.htm",
                "https://www.nationsonline.org/oneworld/maldives.htm",
                "https://www.nationsonline.org/oneworld/mali.htm",
                "https://www.nationsonline.org/oneworld/malta.htm",
                "https://www.nationsonline.org/oneworld/marshall_islands.htm",
                "https://www.nationsonline.org/oneworld/mauritania.htm",
                "https://www.nationsonline.org/oneworld/mauritius.htm",
                "https://www.nationsonline.org/oneworld/mexico.htm",
                "https://www.nationsonline.org/oneworld/micronesia.htm",
                "https://www.nationsonline.org/oneworld/moldova.htm",
                "https://www.nationsonline.org/oneworld/monaco.htm",
                "https://www.nationsonline.org/oneworld/mongolia.htm",
                "https://www.nationsonline.org/oneworld/montenegro.htm",
                "https://www.nationsonline.org/oneworld/morocco.htm",
                "https://www.nationsonline.org/oneworld/mozambique.htm",
                "https://www.nationsonline.org/oneworld/myanmar.htm",
                "https://www.nationsonline.org/oneworld/namibia.htm",
                "https://www.nationsonline.org/oneworld/nauru.htm",
                "https://www.nationsonline.org/oneworld/nepal.htm",
                "https://www.nationsonline.org/oneworld/netherlands.htm",
                "https://www.nationsonline.org/oneworld/new_zealand.htm",
                "https://www.nationsonline.org/oneworld/nicaragua.htm",
                "https://www.nationsonline.org/oneworld/niger.htm",
                "https://www.nationsonline.org/oneworld/nigeria.htm",
                "https://www.nationsonline.org/oneworld/korea_north.htm",
                "https://www.nationsonline.org/oneworld/macedonia_rep.htm",
                "https://www.nationsonline.org/oneworld/norway.htm",
                "https://www.nationsonline.org/oneworld/oman.htm",
                "https://www.nationsonline.org/oneworld/pakistan.htm",
                "https://www.nationsonline.org/oneworld/palau.htm",
                "https://www.nationsonline.org/oneworld/panama.htm",
                "https://www.nationsonline.org/oneworld/papua_new_guinea.htm",
                "https://www.nationsonline.org/oneworld/paraguay.htm",
                "https://www.nationsonline.org/oneworld/peru.htm",
                "https://www.nationsonline.org/oneworld/philippines.htm",
                "https://www.nationsonline.org/oneworld/poland.htm",
                "https://www.nationsonline.org/oneworld/portugal.htm",
                "https://en.wikipedia.org/wiki/Qatar",
                "https://www.nationsonline.org/oneworld/romania.htm",
                "https://www.nationsonline.org/oneworld/russia.htm",
                "https://www.nationsonline.org/oneworld/rwanda.htm",
                "https://www.nationsonline.org/oneworld/saint_kitts_nevis.htm",
                "https://www.nationsonline.org/oneworld/saint_lucia.htm",
                "https://www.nationsonline.org/oneworld/samoa.htm",
                "https://www.nationsonline.org/oneworld/san_marino.htm",
                "https://www.nationsonline.org/oneworld/sao_tome_principe.htm",
                "https://www.nationsonline.org/oneworld/saudi_arabia.htm",
                "https://www.nationsonline.org/oneworld/senegal.htm",
                "https://www.nationsonline.org/oneworld/serbia.htm",
                "https://www.nationsonline.org/oneworld/seychelles.htm",
                "https://www.nationsonline.org/oneworld/sierra_leone.htm",
                "https://www.nationsonline.org/oneworld/singapore.htm",
                "https://www.nationsonline.org/oneworld/slovakia.htm",
                "https://www.nationsonline.org/oneworld/slovenia.htm",
                "https://www.nationsonline.org/oneworld/solomon_islands.htm",
                "https://www.nationsonline.org/oneworld/somalia.htm",
                "https://www.nationsonline.org/oneworld/south_africa.htm",
                "https://www.nationsonline.org/oneworld/korea_south.htm",
                "https://en.wikipedia.org/wiki/South_Sudan",
                "https://www.nationsonline.org/oneworld/spain.htm",
                "https://www.nationsonline.org/oneworld/sri_lanka.htm",
                "https://www.nationsonline.org/oneworld/saint_vincent_grenadines.htm",
                "https://www.nationsonline.org/oneworld/palestinian_territory.htm",
                "https://www.nationsonline.org/oneworld/sudan.htm",
                "https://www.nationsonline.org/oneworld/suriname.htm",
                "https://www.nationsonline.org/oneworld/sweden.htm",
                "https://www.nationsonline.org/oneworld/switzerland.htm",
                "https://www.nationsonline.org/oneworld/syria.htm",
                "https://www.nationsonline.org/oneworld/tajikistan.htm",
                "https://www.nationsonline.org/oneworld/tanzania.htm",
                "https://www.nationsonline.org/oneworld/thailand.htm",
                "https://www.nationsonline.org/oneworld/timor_leste.htm",
                "https://www.nationsonline.org/oneworld/togo.htm",
                "https://www.nationsonline.org/oneworld/tonga.htm",
                "https://www.nationsonline.org/oneworld/trinidad_and_tobago.htm",
                "https://www.nationsonline.org/oneworld/tunisia.htm",
                "https://www.nationsonline.org/oneworld/turkey.htm",
                "https://www.nationsonline.org/oneworld/turkmenistan.htm",
                "https://www.nationsonline.org/oneworld/tuvalu.htm",
                "https://www.nationsonline.org/oneworld/uganda.htm",
                "https://www.nationsonline.org/oneworld/ukraine.htm",
                "https://www.nationsonline.org/oneworld/arab_emirates.htm",
                "https://www.nationsonline.org/oneworld/united_kingdom.htm",
                "https://www.nationsonline.org/oneworld/united_states.htm",
                "https://www.nationsonline.org/oneworld/uruguay.htm",
                "https://www.nationsonline.org/oneworld/uzbekistan.htm",
                "https://www.nationsonline.org/oneworld/vanuatu.htm",
                "https://www.nationsonline.org/oneworld/venezuela.htm",
                "https://www.nationsonline.org/oneworld/vietnam.htm",
                "https://www.nationsonline.org/oneworld/yemen.htm",
                "https://www.nationsonline.org/oneworld/zambia.htm",
                "https://www.nationsonline.org/oneworld/zimbabwe.htm" };

            for (int i = 0; i < countryName.length; i++) {
                countries.add(new Country(countryName[i], flagsLink[i],capitals[i],website[i]));
            }
    }
}
