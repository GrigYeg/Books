package com.yegrig.books.book;

import java.util.ArrayList;

public class BookRepositoryImpl implements BookRepository {
    ArrayList<Book> items;

    public BookRepositoryImpl()
    {
        items = new ArrayList<>();
        items.add(new Book("Гаррі Поттер",
                           "Джоан Роулінг",
                           "У книгах розповідається про пригоди юного чарівника Гаррі Поттера і його друзів Герміону Ґрейнджер і Рона Візлі, які навчаються у Гоґвортській школі чарів і чаклунства. Основний сюжет присвячений боротьбі Гаррі проти темного чаклуна лорда Волдеморта, який намірюється стати безсмертним, повалити чаклунський керівний орган і підкорити всіх чарівників і маґлів (не чарівників). Дія книг відбувається у Вигаданому всесвіті Гаррі Поттера."));

        items.add(new Book("Володар Кілець",
                           "Дж. Толкін",
                           "Основою цієї історії є боротьба за Перстень Влади, що випадково потрапив до рук гобіта Більбо Торбина. Саме цього Персня бракує Темному Володареві для того, щоби завоювати увесь світ. Тепер небезпечні пригоди випадають на долю Фродо Торбина, бо йому довірено цей Перстень. Він мусить залишити свій дім і вирушити у небезпечну мандрівку просторами Середзем’я аж до Судної Гори, що розташована в осерді володінь Темного Володаря. Саме там він має знищити Перстень і завадити втіленню лихого задуму."));

        items.add(new Book("Чароділ",
                           "Наталя Щерба",
                           "Тетяна живе звичайним життям у невеличкому місті в Карпатах. Одного дня вона отримує дивний спадок від своєї прабаби Мар'яни - шкатулку, в якій є браслет та дивний напій. В листі, який був у шкатулці, сказано, що коли випити той дивний напій в північ, то вона зможе полетіти на скині та відвідати справжній шабаш. Знала б Таня раніше, скільки проблем вона отримає в спадок разом з браслетом, мабуть ніколи б не наважилася його одягнути."));

        items.add(new Book("Амарі та брати ночі",
                           "Б.Б. Олстон",
                           "Квінтон Пітерз зник шість місяців тому, і всі, окрім його сестри Амарі, вважають, що хлопець мертвий. Несподіване послання від брата підсилює впевненість дівчинки в тому, що він досі живий. Та як довести це іншим? І де Квінтон перебуває насправді? Виконуючи дивні братові завдання, Амарі потрапляє до Бюро надприродних справ, у якому знайомиться з безліччю магів, фей, перевертнів та інших істот з фантастичними здібностями. Дівчина змагається з силами зла та сподівається рано чи пізно розгадати, де ж таки Квінтон. І це все — на тлі булінгу й нерозуміння з боку однокласників…"));

        items.add(new Book("Сутінки",
                           "Стефані Маєр",
                           "Буття у похмурому містечку Форкс, куди Белла Свон змушена перебратися, спершу видається напрочуд нудним. Аж поки вона не зустрічає загадкового й принадного Едварда Каллена — тоді в її світ вдираються страх і небезпека. Едвард, із його порцеляновою шкірою, золотавими очима, чарівливим голосом і надприродними здібностями, водночас таємничий і звабливий. Досі йому вдавалося зберегти свої темні секрети, та Белла затялася викрити їх. От тільки Белла поки що не усвідомлює: близькість до Едварда ставить під загрозу не лише її власне життя, а й життя її рідних. Ще трошки — і вороття не буде..."));

        items.add(new Book("Убивство у «Східному експресі»",
                           "Аґата Крісті",
                           "Бельгійський детектив Еркюль Пуаро мусить терміново виїхати зі Стамбула до Англії, але вільних місць у «Східному експресі» вже немає. Його виручає давній друг мсьє Бук, власник компанії, якій належить поїзд. Зранку за сніданком детектив помічає, що пасажири експреса — люди різних національностей, які випадково опинилися в одному вагоні. Американець Ретчетт, що видається Пуаро надто підозрілим, просить детектива стати його охоронцем. Але той відмовляється. Уночі Пуаро весь час будять різні звуки й стукіт, та потім настає тиша — через снігові замети поїзд зупиняється десь у Югославії, пасажири напружені, а дивний містер Ретчетт лежить мертвий у своєму купе… Детектив Пуаро береться до розслідування."));

        items.add(new Book("Хлопець з Колорадо",
                           "Стівен Кінг",
                           "У 1980 році двоє підлітків виявляють труп на пляжі одного з островів в штаті Мен. Він помер від задухи, а останній раз його бачили за тисячі кілометрів у Колорадо лише за кілька годин до смерті. Через 25 років журналістка Стефані Маккенн дізнається цю загадкову історію від ветеранів місцевої газети."));

        items.add(new Book("Темні початки",
                           "Філіп Пулман",
                           "Дія роману відбувається у вигаданому паралельному світі, де переплетені наука і магія і де, крім людей, мешкають фантастичні персонажі.Ліра Белаква живе в Оксфорді при одному з коледжів, її дядько — могутній лорд Азріель — здійснює часті експедиції на Північ. Під час чергової експедиції магістр коледжу віддає Ліру на виховання місіс Колтер, але коли Ліра розуміє, що місіс Колтер не та, за кого себе видає, тікає й приєднується до циган, які вирушають на Північ рятувати дітей. Там вона дізнається правду про лорда Азріеля."));
    }

    @Override
    public ArrayList<Book> getBooks() {
        return items;
    }

    @Override
    public Book getBookById(int id) {
        return items.get(id);
    }
}
