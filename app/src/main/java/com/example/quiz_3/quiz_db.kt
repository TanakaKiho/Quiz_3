package com.example.quiz_3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


public class quiz_db(private val context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {
    var errMsg = ""

    companion object {
        //データベースファイル名の定数フィールド
        private const val DATABASE_NAME = "quiz_maindb.db"

        //バージョン情報abstract
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
       // val del="drop table quiz_list_table if exits;"
        val sb = StringBuilder()
        var sb2 =""
        val sb3 = StringBuilder()

        //Todoを登録するテーブル
        sb.append("CREATE TABLE quiz_list_table (")
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , ")
        //sb.append("genre_type TEXT, ")
        //sb.append("genre_num INTEGER, ")
        sb.append("question_image BLOB, ")
        sb.append("answer INTEGER, ")
        sb.append("choice_1 TEXT, ")
        sb.append("choice_2 TEXT, ")
        sb.append("choice_3 TEXT, ")
        sb.append("choice_4 TEXT ")
        sb.append(");")

        //SQLの実行
        val sqlquiz = sb.toString()

        //SQLの実行
        db.execSQL(sqlquiz)

        sb.clear()
        //db.execSQL(del)

        //下の三行がひとつのかたまり
        //【アニメ】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an1', 1, '心臓麻痺','呼吸停止', '脳出血','衰弱死' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime2', 2, '神砂嵐','波紋', '気化冷凍法','赤い荒縄' );  "
        //sqlIns = sb2.toString()
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime3', 1, 'エイジャの赤石','エイダ赤石', 'アレキサンドライト','ダイヤモンド' );  "
        //var sqlIns = sb2.toString()
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime4', 2, 'ザ・ワールド','エンペラー', 'エンプレス','クィーン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime5', 1, '卵','幼虫', '蛹','成虫' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime6', 3, 'ブチャラティ','セッコ', 'ルカ','DIO' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime7', 2, '消防士','警察官', '救急隊員','パトリオット制作工場長' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime8', 1, '亀','蛇', '蛙','鳥' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime9', 3, '赤','青', '黒','白' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime10', 4, '水','雷', '風','炎' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime11', 4, '石鹸','火薬', '水酸化ナトリウム','炭酸カルシウム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime12', 2, 'そば','ラーメン', 'うどん','餅' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime13', 2, '悟空','ベジータ', 'トランクス','ヤムチャ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime14', 3, '訓練兵団','駐屯兵団', '調査兵団','憲兵団' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime15', 2, '大型巨人','超大型巨人', '超超大型巨人','超超超大型巨人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime16', 3, 'リバイア','リバイ', 'リヴァイ','ヤバイ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime17', 2, '2人','3人', '4人','5人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime18', 1, '啓礼時の手が逆だった','啓礼時の手の甲が下を向いていた', '教官の話を聞いていなかった','黙って抜け出そうとした' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime19', 3, 'シーナ','マイア', 'ローゼ','マリア' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime20', 3, '作戦内容の確認','エレンの寝床', '本部の掃除','馬のエサやり' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime21', 2, 'アルミン','マルコ', 'ライナー','ジャン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime22', 4, '月に代わってお仕置きよ','水でもかぶって反省しなさい', 'しびれるくらい後悔させるよ','愛の天罰落とさせていただきます' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an23', 4, '千年リング','千年眼', '千年ロッド','千年パズル' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an24', 3, '海馬瀬人','孔雀舞', 'ダイナソー竜崎','バンデット・キース' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an25', 1, 'おじゃま・レッド','おじゃま・イエロー', 'おじゃま・グリーン','おじゃま・ブラック' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an26', 3, 'だが俺はレアだぜ','おい、デュエルしろよ', '雑魚だったろ、相手','カードは拾った' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an27', 2, 'No.39 希望皇ホープ・ダブル','CNo.39 希望皇ホープレイ', 'FNo.0 未来王ホープ','No.99 希望皇ホープドラグナー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an28', 2, '爪','髪', '肋骨','歯' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an29', 2, 'アラビアに吹く熱風','メキシコに吹く熱風', 'カリフォルニアに吹く熱風','スペインに吹く熱風' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an30', 4, '鋼の流法','刃の流法', '輝の流法','光の流法' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an31', 4, 'ラリアット','膝蹴り', 'ビンタ','肘打ち' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an32', 1, 'ロードローラー','ダンプ', '掘削機','不発弾' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an33', 1, 'クモ','ムカデ', 'サソリ','ゴキブリ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an34', 3, '賭け事','「4」という数字', 'サイレンの音','辛い食べ物' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an35', 2, 'ウミウシ','クラゲ', 'クリオネ','イソギンチャック' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an36', 4, 'ナンバー1','ナンバー2', 'ナンバー3','ナンバー4' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an37', 4, '肉体','右腕', '内蔵','左脚' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an38', 1, '巨人（通常種）の位置','巨人（奇行種）の位置', '荷馬車班の現在位置','陣形の進行ルート' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an39', 2, '晶遁','氷遁', '嵐遁','白眼' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an40', 1, '分身の術','変化の術', '変わり身の術','お色気の術' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an41', 3, 'うすしお','のりしお', 'コンソメ','サワークリームオニオン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an42', 1, '不動卿','神秘卿', '殲滅卿','黎明卿' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an43', 3, '全身に走る激痛と、穴という穴からの流血','全感覚の喪失と、それに伴う意識混濁、自傷行為', '人間性の喪失、もしくは死','確実な死' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an44', 2, '大断層','なきがらの海', '巨人の盃','還らずの都' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an45', 4, 'オレンジうーぱ','ピンクうーぱ', 'イエローうーぱ','メタルうーぱ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an46', 4, 'トウカイテイオー','ダイワスカーレット', 'ウオッカ','ゴールドシップ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an47', 4, '並々ならぬ精神力を備え持つ','小回りの利く起動が得意', '組織行動には向かない性格','目立った特技は見受けられない' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an48', 2, 'ミリウス','サムエル', 'ミーナ','トーマス' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an49', 3, 'ラオウ','ケンシロウ', 'アミバ','ジャギ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an50', 4, '黒（クロ）','黒（サム）', '黒（カゲ）','黒（ヘイ）' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an51', 1, 'リバイバル','リロード', 'バタフライエフェクト','タイムリープ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an52', 1, 'SofBank','animate', 'DMM.com','BANDAI' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an53', 3, 'バイク','車', 'ゲーム','パソコン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an54', 2, '戦闘力…たったの5か…','じゅ…180000!?', '530000です','100万以上は確実か…' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an55', 4, 'エルヴィン団長','ナイル師団長', 'ザックレー総統','ピクシス司令' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an56', 4, '緑の煙弾','黒の煙弾', '閃光弾','音響弾' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an57', 3, 'ライナー','ベルトルト', 'アニ','ミカサ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an58', 3, '父親','母親', '祖父','祖母' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an59', 1, 'トーマス','ミーナ', 'マルコ','コニー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an60', 3, '102期','103期', '104期','105期' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an61', 2, '50人','100人', '150人','200人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an62', 1, 'リヴァイ班','巨人殲滅班', '巨人殺しの達人集団','変人の巣窟' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an63', 3, '魚','新鮮な水', '紅茶','肉' );  "
        db.execSQL(sb2)
        //【ゲーム】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm1', 1, 'リオレイア','リオレウス', 'ラオシャンロン','ミラボレアス' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm2', 2, '大剣','太刀', '双剣','ライトボウガン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm3', 4, '嵐龍','黒龍', '錆龍','鋼龍' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm4', 2, '増強剤','鎧玉', '武具玉','フエールピッケル' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm5', 1, '激昂したラージャン','紅龍ミラボレアス', 'ラオシャンロン亜種','錆びたクシャルダオラ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm6', 3, 'アオキノコ','サボテンの花', 'イキツギ藻','ネンチャク草' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm7', 1, '攻撃力ブースト','カスタム強化', '極限強化','鬼刃化' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm8', 4, 'アルバトリオン','ヒプノック希少種', 'ティガレックス希少種','ナルガクルガ希少種' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm9', 1, '眼','口', '前脚','鱗' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm10', 3, 'グラビモス','ティガレックス', 'ガララアジャラ','ディアブロス' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm11', 2, '1つ','２つ', '３つ','４つ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm12', 3, '天眼ディアブロス','燼滅刃ディアブロス', '鏖魔ディアブロス','矛砕ディアブロス' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm13', 2, 'ドラグライト鉱石','ユニオン鉱石', 'ライトクリスタル','熔山龍の岩殻' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm14', 1, '六花が静かに眠るなら','されど気高き我が魂よ', '殲滅の主はまた鐘を鳴らす','冰冠のフラーズダルム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm15', 1, '4回','5回', '6回','7回' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm16', 4, 'バタースコッチパイ','シナモンパイ', 'ケチャップ','カタツムリ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm17', 3, '2','7', '8','11' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm18', 2, 'オルタネーター','フラットライン', 'ヘムロック','Ｌ-スター' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm19', 3, 'マザーロード','防衛爆撃', 'ローリングサンダー','ミサイルスワーム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm20', 2, 'チャージクラッシュ','インパルスエッジ', 'オラクルリザーブ','エリアルステップ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm21', 2, '３周','５周', '７周','９周' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm22', 1, '王家の墓穴','ロンロン牧場', '森の聖域','時の神殿' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm23', 4, '赤','桃', '橙','黒' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm24', 1, 'ナイトウォーク','スペースダンス', 'ゐあひぎり','しろいおばけ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm25', 1, '伝説の巨大甲虫','アジア最強のカブトムシ', 'ボルネオの守護神','ボルネオの守護神' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm26', 3, '日本の英雄（ヒーロー）','熱血甲虫', '甲虫王者','赤きサムライ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm27', 2, 'ノコをもつサムライ','みんなのアイドル', 'オレンジのハヤブサ','黄金（こがね）の鎧' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm28', 4, '悟空＆ベジータ','孫悟飯', 'ゴールデンフリーザ','クウラ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm29', 3, 'マナ','アルセーヌ', 'ネオ','ビナー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm30', 4, '幻の大地','エデンの戦士たち', '空と海と大地と呪われし姫君','星空の守り人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm31', 4, 'スライム','ドラキー', 'タマゴロン','決まっていない' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('gm32', 2, 'エスターク','神鳥レティス', 'キャプテン・クロウ','スぺディオ' );  "
        db.execSQL(sb2)
        //【特撮】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk1', 2, 'メダル','携帯', 'カード','宝石' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk2', 1, 'クロックアップ','アクセル', 'ドライブ','トライアル' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk3', 3, 'クワガタムシ','カブトムシ', '龍','ヒョウ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk4', 3, 'ダイヤ','クラブ', 'スペード','ハート' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk5', 4, 'アンノウン','イマジン', 'ショッカー','ワーム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk6', 2, '賀集利樹','佐藤健', '水嶋ヒロ','倉田てつを' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk7', 3, 'マイティフォーム','ドラゴンフォーム', 'ペガサスフォーム','タイタンフォーム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk8', 2, '123','132', '213','231' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk9', 4, '0.1秒','3秒', '9.8秒','10秒' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk10', 1, 'ストライクベント','トリックベント', 'ガードベント','ナスティベント' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk11', 3, '1体','4体', '13体','52体' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk12', 1, '変身音叉・音角','変身音鼓・音胴', '変身鬼弦・音錠','変身鬼笛・音笛' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk13', 1, '天道総司','加賀美新', '矢車想','三島正人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk14', 2, 'ぎんなん','しいたけ', 'アボカド','ほうれん草' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk15', 3, 'キバットバットⅠ世','キバットバットⅡ世', 'キバットバットⅢ世','キバットバットⅣ世' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk16', 4, '仮面ライダーアギト','仮面ライダー電王 ', '仮面ライダーファイズ','仮面ライダーカブト' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk17', 2, 'ファングジョーカーエクストリーム','サイクロンアクセルエクストリーム', 'サイクロンジョーカーエクストリーム','アクセルジョーカーエクストリーム' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk18', 1, '自身の手術のため','貧困地域への支援のため', '途上国に医療学校を建てるため','紛争地帯に病院を建てるため' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk19', 3, '右腕','左腕', '右脚','左脚' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk20', 4, '道路標識の上','電柱の上', '信号機の上','街灯の上' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk21', 3, 'マスクドヒーロー','ヘルヘイムライダー', 'アーマードライダー','マスクドライダー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk22', 1, 'タイプフォーミュラ','タイプトライドロン', 'タイプデッドヒート','超デッドヒートドライブ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk23', 2, '焼きそば','たこ焼き', 'お好み焼き','もんじゃ焼き' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk24', 4, 'ラヴリカバグスター','カイデンバグスター', 'モータスバグスター','ソルティバグスター' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk25', 4, 'ジェットフルボトル','掃除機フルボトル', 'ガトリングフルボトル','ヘリコプターフルボトル' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('tk26', 4, 'オーズアーマー','電王アーマー', 'ウィザードアーマー','鎧武アーマー' );  "
        db.execSQL(sb2)
        //【雑学】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za1', 1, '赤色','青色', '黄色','透明' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za2', 3, '料理','天候', '悪口','卓球' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za3', 2, '王子','召使い', '貧乏人','兵士' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za4', 3, '弁財天','大黒天', '恵比寿','福禄寿' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za5', 1, '開発担当者の友人の名前','開発担当者の叔父の名前', '開発担当者の名前','開発担当者の娘の名前' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za6', 2, '1kg','3kg', '5kg','10kg' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za7', 3, '動いていないと血流が悪くなる','心臓と連動しているから', '泳ぐことで呼吸をしているから','実際は止まっても平気' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za8', 2, '約300本','約400本', '約800本','約1000本' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za9', 1, '薬','洗剤', '肥料','タレ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za10', 2, 'ツバメ','カッコウ', 'スズメ','ハト' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za11', 1, '汗を吸収するため','保温するため', '火を起こすため','敵組織に侵入するため' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za12', 4, '泡','炭酸', '雨','天の川' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za13', 4, 'クラベド','フラベド', 'ミリアド','アルベド' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za14', 2, '3人','5人', '7人','9人' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za15', 3, '蒟蒻芋','長芋', 'じゃが芋','里芋' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za16', 3, 'A型','B型', 'O型','AB型' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za17', 3, 'チョコレート','ココア', 'ケーキ','小麦' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za18', 4, '1つ','２つ', '３つ','４つ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za19', 1, 'イボ','骨', '筋肉','脂肪' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za20', 4, '哺乳類','爬虫類', '両生類','鳥類' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za21', 2, '聴覚強化','体温調節', '体重分散','実は特にない' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za22', 1, '哺乳類','両生類', '爬虫類','鳥類' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za23', 3, '太陽光','エサの色素', '羽毛の生え変わり','羽毛の乾き' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za24', 4, '目','口', '胃','心臓' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za25', 3, '群れを作って生活する','木登りが苦手', '木から降りるのが苦手','この中にはない' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za26', 1, '哺乳類','両生類', '爬虫類','鳥類' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('za27', 1, '赤色','青色', '黄色','全ての色を認識できる' );  "
        db.execSQL(sb2)
        //【食べ物】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co1', 1, 'ささがけ','ささがき', 'さきがけ','さきぎり' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co2', 3, 'ブレダラ','パパリーヌ', 'カヌレ','ヌガー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co3', 2, 'キャビア','フォアグラ', 'ツバメの巣','トリュフ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co4', 4, '日本料理','イタリア料理', 'アイルランド料理','トルコ料理' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co5', 3, 'クルミ','アーモンド', 'マカダミアナッツ','カシューナッツ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co6', 3, '馬','鹿', 'イノシシ','ウサギ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co7', 2, 'マグロ','サケ', 'アジ','サンマ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co8', 1, '酢豚','麻婆豆腐', '担々麵','棒棒鶏' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co9', 3, 'エッグノッグ','ケフィア', 'ラッシー','チェンドル' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co10', 3, 'ダイコン','ニンジン', 'トマト','カボチャ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('co11', 1, 'スターゲイジーパイ','ムーンゲイジーパイ', 'サンゲイジーパイ','スペースゲイジーパイ' );  "
        db.execSQL(sb2)
        /*【音楽】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu1', , 'リラ','ベル', 'リサ','ヴィオラ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu2', , '卓球でスマッシュを打つ曲','サッカーボールを蹴る曲', '野球ボールを打つ曲','バスケットボールでドリブルする曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu3', , 'マスカラを割る曲','ティンパニーを突き破る曲', 'コントラバスの弦を切る曲','シンバルを折る曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu4', , '机を破壊する曲','帽子をたたく曲', 'フライパンをたたく曲','餅つきをする曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu5', , '練習曲','夜想曲', '行進曲','円舞曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu6', , '交響曲','小夜曲', '練習曲','幻想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu7', , '海想曲','乱舞曲', '前奏曲','後奏曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu8', , '三重奏','四重奏', '五重奏','六重奏' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu9', , '交響曲','練習曲', '行進曲','幻想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu10', , '協奏曲','交響曲', '幻想曲','夜想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu11', , '夜想曲','小夜曲', '鎮魂歌','幻想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu12', , '行進曲','交響曲', '前進曲','幻想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu13', , '夜想曲','狂詩曲', '小夜曲','幻想曲' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu14', , 'サックス','ホルン', 'フルート','オーボエ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu15', , 'ユーフォニウム','サックス', 'トランペット','トロンボーン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu16', , 'ソプラノサックス','アルトサックス', 'テナーサックス','バリトンサックス' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu17', , 'バスドラム','スネアドラム', 'クラッシュシンバル','シロファン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu18', , '日本','アメリカ（英語圏）', 'ドイツ','イタリア' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu19', , 'クラリネット','サックス', 'ホルン','オーボエ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('mu20', , '長調','旋律的短調', '自然的短調','和声的短調' );  "
        db.execSQL(sb2)
        */
        //【スポーツ】
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp1', 2, 'レッドカード','イエローカード', 'グリーンカード','ブラックカード' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp2', 1, 'レッドカード','イエローカード', 'グリーンカード','ブラックカード' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp3', 2, 'えのび','けのび', 'せのび','てのび' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp4', 3, '300cm','290m', '305cm','310cm' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp5', 4, '1点','2点', '3点','5点' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp6', 3, '1点','2点', '3点','5点' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp7', 2, '1点','2点', '3点','5点' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp8', 3, 'ソード','ブレード', 'サーブル','スラッシュ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp9', 2, '白色','黄色', '茶色','水色' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp10', 2, 'スラッシュ','スカッシュ', 'スマッシュ','クラッシュ' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp11', 4, 'サッカー','バレーボール', 'クリケット','野球' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp12', 4, '200m','300m', '450m','600m' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp13', 3, '赤色','青色', '黄色','緑色' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp14', 1, '赤色','青色', '黄色','緑色' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp15', 2, '20秒ルール','24秒ルール', '27秒ルール','30秒ルール' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp16', 1, 'ダブル','ハムボーン', 'ターキー','ヤッツィー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp17', 3, 'ダブル','ハムボーン', 'ターキー','ヤッツィー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp18', 2, 'ダブル','ハムボーン', 'ターキー','ヤッツィー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp19', 4, 'ダブル','ハムボーン', 'ターキー','ヤッツィー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp20', 2, 'スケルトン','トライアル', 'リユージュ','ボブスレー' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('sp21', 4, '赤色','青色', '黄色','緑色' );  "
        db.execSQL(sb2)

        //sb2.append("INSERT INTO quiz_list_table ")
        //sb2.append("(_id, question_image, answer, choice_1, choice_2, choice_3, choice_4) values (")
        //sb2.append("(question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES (")
        //sb2.append("0, ")
        //sb.append("'スポーツ', ")
        //sb.append("1, ")
        //sb2.append("'sp_1', ")
        //sb2.append("4, ")
        //sb2.append("'1点', ")
        //sb2.append("'2点', ")
        //sb2.append("'3点', ")
        //sb2.append("'5点' ")
        //sb2.append(");")

        //val sqlIns = sb2.toString()

      // db.execSQL(sqlIns)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun fileDelete(){
        context.deleteDatabase("quiz_maindb.db")
    }

    val listQuiz = mutableListOf("1")
    fun getQuizList(num:Int) :List<String> {

        //データベース接続オブジェクトを取得
        val db = this.writableDatabase

        //検索SQLを作成
        val sql = "SELECT * FROM quiz_list_table WHERE id='"+num+"';"
        //val sql = "SELECT * FROM quiz_list_table;"

        //SQLの実行
        val cursor = db.rawQuery(sql, null)

        //カテゴリーのリストを作成
        var todoTitle = ""

        var note=""
        while(cursor.moveToNext()) {
            //IDの列インデックスを取得
            val idxID = cursor.getColumnIndex("id")
            val idxima = cursor.getColumnIndex("question_image")
            val idxans = cursor.getColumnIndex("answer")
            val idxc1 = cursor.getColumnIndex("choice_1")
            val idxc2 = cursor.getColumnIndex("choice_2")
            val idxc3 = cursor.getColumnIndex("choice_3")
            val idxc4 = cursor.getColumnIndex("choice_4")

            //IDの値を取得
            note = cursor.getString(idxID)
            //IDを確保
            listQuiz.add(note);

            note = cursor.getString(idxima)
            listQuiz.add(note);
            note = cursor.getString(idxans)
            listQuiz.add(note);
            note = cursor.getString(idxc1)
            listQuiz.add(note);
            note = cursor.getString(idxc2)
            listQuiz.add(note);
            note = cursor.getString(idxc3)
            listQuiz.add(note);
            note = cursor.getString(idxc4)
            listQuiz.add(note);
            note = cursor.getString(idxima)
            listQuiz.add(note);

        }

        return listQuiz

    }
}

