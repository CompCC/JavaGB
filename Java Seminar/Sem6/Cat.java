public class Cat {
    private String name = null;   // РїРѕР»Рµ РєР»Р°СЃСЃР° (field)
    private String breed = null;   // РїРѕСЂРѕРґР°

    public Cat (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean equals (Object other) {   // РјРµС‚РѕРґ (method)
        return true;
    }
}